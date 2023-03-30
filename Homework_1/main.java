// Обязательное . Делайте по своим силам, главное реализовать то что было на семинаре.
// 1. Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
// Идея: описать некоторое количество компонент, например:
// модель человека
// компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
// компонент для проведения исследований
// дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
// Под “проведением исследования” можно понимать получение всех детей выбранного человека.
// Не обязательное
// 2.Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек. Какие члены должны быть у каждого из классов (у меня на семинаре студенты пришли к тому, чтобы продумать логику взаимодействия жена разрешает открыть дверцу шкафа мужу, после чего эту дверцу можно открыть)
// Подумать как описать логику взаимодействия человека и домашнего питомца. Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. Какое ещё взаимодействие может быть?
// У задач нет единственного правильного решения

package Homework_1;

public class main {
    public static void main(String[] args) {
        
        father father = new father(43, 87, 181, "blue", "funny");
        father.printСharacteristics();
        
        mother mother = new mother(35, 72, 172, "green", "caring");
        mother.printСharacteristics();
        
        son son1 = new son(5, 20, 100);
        son1.printСharacteristics();
        
        father son2 = new son(12, 40, 150, mother.getEyeColer(), father.humanTrait);
        son2.printСharacteristics();

        father.collSon(son1);

    }
}