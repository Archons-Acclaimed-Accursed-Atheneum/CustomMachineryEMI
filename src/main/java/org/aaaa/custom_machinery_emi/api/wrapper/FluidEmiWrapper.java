package org.aaaa.custom_machinery_emi.api.wrapper;

import org.aaaa.custom_machinery_emi.api.EmiIngredientWrapper;
import fr.frinn.custommachinery.api.requirement.RequirementIOMode;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;

import java.util.List;

/**
 * Wrapper for fluid ingredients
 */
public record FluidEmiWrapper(
        RequirementIOMode mode,
        SizedFluidIngredient ingredient,
        double chance,
        boolean isPerTick,
        List<String> tanks
) implements EmiIngredientWrapper {
}