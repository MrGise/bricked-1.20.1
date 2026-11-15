package net.MrGise.bricked;

import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper;
import net.MrGise.bricked.datagen.client.BrickedBlockStateProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BrickedDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator generator) {
		FabricDataGenerator.Pack pack = generator.createPack();
		ExistingFileHelper exFileHelper = ExistingFileHelper.withResourcesFromArg();

		pack.addProvider((out, future) -> new BrickedBlockStateProvider(out, exFileHelper));
	}
}
