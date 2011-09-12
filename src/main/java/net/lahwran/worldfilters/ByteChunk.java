/**
 * 
 */
package net.lahwran.worldfilters;

/**
 * @author lahwran
 *
 */
class ByteChunk implements GeneratedChunk {

    protected byte[] bytes;

    public ByteChunk(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setBlockID(int x, int y, int z, byte value) {
        bytes[(x * 16 + z) * 128 + y]  = value;
    }

    public byte getBlockID(int x, int y, int z) {
        return bytes[(x * 16 + z) * 128 + y];
    }
}
