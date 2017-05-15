package com.greenfox.calorietable;

import java.util.ArrayList;
import java.util.List;

public class CalorieTable {
  List<Food> foodList;

  public CalorieTable() {
    this.foodList = new ArrayList<>();
    foodList.add(new Food("burger", 1, 200.0));
    foodList.add(new Food("salata", 1, 50.0));
  }

  public List<Food> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<Food> foodList) {
    this.foodList = foodList;
  }
}
