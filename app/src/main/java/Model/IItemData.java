package Model;

import java.util.List;

public interface IItemData {

   public List<String> getCategories() ;
   public List<FoodItems>getItemsByCategory(String cat) ;
}
