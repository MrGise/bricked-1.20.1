package net.MrGise.bricked.datagen.client;

import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper;
import io.github.fabricators_of_create.porting_lib.models.generators.block.BlockModelBuilder;
import io.github.fabricators_of_create.porting_lib.models.generators.block.BlockStateProvider;
import net.MrGise.bricked.Bricked;
import net.MrGise.bricked.content.block.BrickedBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;

public class BrickedBlockStateProvider extends BlockStateProvider {
    public BrickedBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Bricked.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        BlockModelBuilder brickStation = models().getBuilder(Bricked.util.resource().blockId(BrickedBlocks.BRICK_STATION))
                .texture("particle", mcLoc("block/smithing_table_top"))
                .texture("side", mcLoc("block/smithing_table_side"))
                .texture("top", mcLoc("block/smithing_table_top"))

                .element()
                .from(0, 0, 0).to(2, 14, 2)
                .allFaces((dir, faceBuilder) -> {
                    faceBuilder.texture(dir == Direction.DOWN || dir == Direction.UP ? "#top" : "#side");
                    switch (dir) {
                        case NORTH, SOUTH -> faceBuilder.uvs(0, 2, 2, 16);
                        case EAST, WEST -> faceBuilder.uvs(14, 2, 16, 16);
                        case UP, DOWN -> faceBuilder.uvs(0, 0, 2, 2);
                    }
                }).end()
                .element()
                .from(14, 0, 0).to(16, 14, 2)
                .allFaces((dir, faceBuilder) -> {
                    faceBuilder.texture(dir == Direction.DOWN || dir == Direction.UP ? "#top" : "#side");
                    switch (dir) {
                        case NORTH, SOUTH -> faceBuilder.uvs(0, 2, 2, 16);
                        case EAST, WEST -> faceBuilder.uvs(14, 2, 16, 16);
                        case UP, DOWN -> faceBuilder.uvs(0, 0, 2, 2);
                    }
                }).end()
                .element()
                .from(14, 0, 14).to(16, 14, 16)
                .allFaces((dir, faceBuilder) -> {
                    faceBuilder.texture(dir == Direction.DOWN || dir == Direction.UP ? "#top" : "#side");
                    switch (dir) {
                        case EAST, WEST -> faceBuilder.uvs(0, 2, 2, 16);
                        case NORTH, SOUTH -> faceBuilder.uvs(14, 2, 16, 16);
                        case UP, DOWN -> faceBuilder.uvs(0, 0, 2, 2);
                    }
                }).end()
                .element()
                .from(0, 0, 14).to(2, 14, 16)
                .allFaces((dir, faceBuilder) -> {
                    faceBuilder.texture(dir == Direction.DOWN || dir == Direction.UP ? "#top" : "#side");
                    switch (dir) {
                        case EAST, WEST -> faceBuilder.uvs(0, 2, 2, 16);
                        case NORTH, SOUTH -> faceBuilder.uvs(14, 2, 16, 16);
                        case UP, DOWN -> faceBuilder.uvs(0, 0, 2, 2);
                    }
                }).end()
                .element()
                .from(0, 14, 0).to(16, 16, 16)
                .allFaces((dir, faceBuilder) -> {
                    faceBuilder.texture(dir == Direction.DOWN || dir == Direction.UP ? "#top" : "#side");
                    switch (dir) {
                        case NORTH, SOUTH, EAST, WEST -> faceBuilder.uvs(0, 0, 16, 2);
                        case UP, DOWN -> faceBuilder.uvs(0, 0, 16, 16);
                    }
                }).end();

        simpleBlockWithItem(BrickedBlocks.BRICK_STATION, brickStation);
    }
}
