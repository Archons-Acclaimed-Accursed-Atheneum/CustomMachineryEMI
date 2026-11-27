package org.aaaa.custom_machinery_emi.api.wrapper;

import org.aaaa.custom_machinery_emi.api.EmiIngredientWrapper;
import fr.frinn.custommachinery.api.requirement.RequirementIOMode;

/**
 * Wrapper for Ars Nouveau Source ingredients
 */
public record SourceEmiWrapper(RequirementIOMode mode, int amount, boolean isPerTick,
                               int recipeTime) implements EmiIngredientWrapper {
}

