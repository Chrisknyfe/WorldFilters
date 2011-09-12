/**
 * 
 */
package net.lahwran.worldfilters;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

/**
 * @author lahwran
 *
 */
public class Pipeline extends ChunkGenerator {

    protected final ChunkGenerator base;
    protected final ArrayList<GenerationFilter> filterslist = new ArrayList<GenerationFilter>();
    protected GenerationFilter[] filters;

    public Pipeline(ChunkGenerator base) {
        this.base = base;
    }

    public Pipeline() {
        this.base = new EmptyChunkGenerator();
    }

    void freeze() {
        if (filters != null)
            throw new IllegalStateException("Pipeline already finalized");
        filters = filterslist.toArray(new GenerationFilter[filterslist.size()]);
    }

    @Override
    public byte[] generate(World world, Random random, int chunkx, int chunky) {
        byte[] bytes = base.generate(world, random, chunkx, chunky);

        ByteChunk chunk = new ByteChunk(bytes);
        for (int idx = 0; idx < filters.length; idx++) {
            filters[idx].generate(chunk);
        }

        return bytes;
    }

}
