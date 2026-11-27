package org.aaaa.custom_machinery_emi.api.wrapper;

import org.aaaa.custom_machinery_emi.api.EmiIngredientWrapper;
import fr.frinn.custommachinery.api.requirement.RequirementIOMode;
import net.neoforged.neoforge.common.crafting.SizedIngredient;

import java.util.List;

/**
 * Wrapper for item ingredients
 */
public record ItemEmiWrapper(
        RequirementIOMode mode,
        SizedIngredient ingredient,
        double chance,
        boolean useDurability,
        List<String> slots,
        boolean showRequireSlot
) implements EmiIngredientWrapper {
}