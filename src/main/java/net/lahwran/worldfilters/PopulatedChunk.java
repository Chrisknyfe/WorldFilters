/**
 * 
 */
package net.lahwran.worldfilters;

import org.bukkit.Chunk;

/**
 * @author lahwran
 *
 */
public class PopulatedChunk implements GeneratedChunk {

    protected final Chunk chunk;

    public PopulatedChunk(Chunk chunk) {
        this.chunk = chunk;
    }

    @Override
    public byte getBlockID(int x, int y, int z) {
        return (byte) chunk.getBlock(x, y, z).getTypeId();
    }

    @Override
    public void setBlockID(int x, int y, int z, byte value) {
       chunk.getBlock(y, y, z).setTypeId(value);
    }

}
