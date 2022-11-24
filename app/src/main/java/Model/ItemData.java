package Model;

import java.util.LinkedList;
import java.util.List;

public class ItemData implements IItemData{

    LinkedList<FoodItems> items = new LinkedList<>() ;
    LinkedList<FoodItems> AllItemsBycat = new LinkedList<>() ;

    public  ItemData () {
        items.add(new FoodItems("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItems("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItems("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItems("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItems("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItems("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItems("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItems("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItems("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItems("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItems("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItems("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
        items.add(new FoodItems("Classic Burger" , "Burgers" , 50)) ;
        items.add(new FoodItems("Classic Drink" , "Drinks" , 34)) ;
        items.add(new FoodItems("Classic Hot Drinks" , "Hot Drinks" , 364)) ;
    }
    @Override
    public List<String> getCategories() {
        LinkedList<String>AllItemsTemp = new LinkedList<>() ;
        for (FoodItems fi : items) {
            AllItemsTemp.add(fi.getCat());
        }
        return AllItemsTemp;
    }

    @Override
    public List<FoodItems> getItemsByCategory(String cat) {

        for (FoodItems fi : items) {
            if (fi.getCat().equals(cat)){
                AllItemsBycat.add(fi);
            }
        }
        return AllItemsBycat;
    }
}
