package com.com.model_alth;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/24 20:32
 * @modified By：
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public boolean customerWantsCondiments() {
        return true;
    }

    public void boilWater() {
        System.out.println("boiling water .....");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
