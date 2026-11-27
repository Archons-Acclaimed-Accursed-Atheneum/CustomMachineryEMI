package org.aaaa.custom_machinery_emi.api.wrapper;

import org.aaaa.custom_machinery_emi.api.EmiIngredientWrapper;
import fr.frinn.custommachinery.api.requirement.RequirementIOMode;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

/**
 * Wrapper for item filter ingredients (always input)
 */
public record ItemFilterEmiWrapper(
        Ingredient ingredient,
        List<String> slots
) implements EmiIngredientWrapper {

    @Override
    public RequirementIOMode mode() {
        return RequirementIOMode.INPUT;
    }
}