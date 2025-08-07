package praktikum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IngredientTest {

    @ParameterizedTest
    @EnumSource(IngredientType.class)
    void testGetType(IngredientType type) {
        Ingredient ingredient = new Ingredient(type, "test", 100);
        assertEquals(type, ingredient.getType());
    }

    @ParameterizedTest
    @ValueSource(strings = {"hot sauce", "cutlet", "cheese"})
    void testGetName(String name) {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, name, 100);
        assertEquals(name, ingredient.getName());
    }

    @ParameterizedTest
    @ValueSource(floats = {100, 200, 50.5f})
    void testGetPrice(float price) {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "test", price);
        assertEquals(price, ingredient.getPrice());
    }
}