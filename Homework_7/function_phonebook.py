from copy import deepcopy

class Phone_book():
    phone_book = []
    new_phone_book = []
    def __init__(self, file_directory):
        self.file_directory = file_directory
        
        with open(file_directory, "r", encoding="UTF-8") as file:
            data = file.readlines()
            for contact in data:
                record = contact.strip().split(";")
                record_contact = {}
                record_contact["name"] = record[0]
                record_contact["phone"] = record[1]
                record_contact["comment"] = record[2]
                self.phone_book.append(record_contact)
            self.new_phone_book = deepcopy(self.phone_book)
        
                
    def save_file_phonebook(self):
        data = []
        for contact in self.phone_book:
            data.append(";".join(contact.values()))
        data = "\n".join(data)
        with open(self.file_directory, "w", encoding="UTF-8") as file:
            file.write(data)
        self.new_phone_book = deepcopy(self.phone_book)
            
    def get(self):
        return self.phone_book

    def add_contact(self,new_contact: dict):
        self.phone_book.append(new_contact)
        
    def change_contact(self, id_user: int, contact):
        self.phone_book.pop(id_user-1)
        self.phone_book.insert(id_user-1, contact)
        
    def find(self, find_contact: str):
        all_find = []
        for contact in self.phone_book:
            for element in contact.values():
                if find_contact.lower() in element.lower():
                    all_find.append(contact)
        return all_find

    def get_name(self, id_user: int):
        return self.phone_book[id_user-1].get("name")

    def delete_contact(self, id_user):
        self.phone_book.pop(id_user-1)

    def check_changes(self):
        if self.phone_book != self.new_phone_book:
            return True
        return False

    def check_open_file(self):
        if self.phone_book != []:
            return True
        return False