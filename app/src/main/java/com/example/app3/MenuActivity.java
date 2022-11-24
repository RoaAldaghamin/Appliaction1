package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import Model.FoodItems;
import Model.IItemData;
import Model.ItemData;

public class MenuActivity extends AppCompatActivity {
private Spinner spinner ;
private ListView listView ;
private Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setUpComponent();
        IItemData iItemData = new ItemData() ;
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this , android.R.layout.simple_list_item_1 , iItemData.getCategories()
        ) ;
      spinner.setAdapter(arrayAdapter);

      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String str = spinner.getSelectedItem().toString() ;

              ArrayAdapter<FoodItems> adapter = new ArrayAdapter<>(
                      MenuActivity.this , android.R.layout.simple_list_item_1 ,   iItemData.getItemsByCategory(str)
              ) ;
              listView.setAdapter(adapter);

          }
      });
    }

    private void setUpComponent() {
        spinner = findViewById(R.id.spnItems) ;
        listView = findViewById(R.id.listItems) ;
        button = findViewById(R.id.Showbutton) ;

    }
}