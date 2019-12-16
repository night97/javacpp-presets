// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Content light level needed by to transmit HDR over HDMI (CTA-861.3).
 *
 * To be used as payload of a AVFrameSideData or AVPacketSideData with the
 * appropriate type.
 *
 * \note The struct should be allocated with av_content_light_metadata_alloc()
 *       and its size is not a part of the public ABI.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVContentLightMetadata extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVContentLightMetadata() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVContentLightMetadata(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVContentLightMetadata(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVContentLightMetadata position(long position) {
        return (AVContentLightMetadata)super.position(position);
    }

    /**
     * Max content light level (cd/m^2).
     */
    public native @Cast("unsigned") int MaxCLL(); public native AVContentLightMetadata MaxCLL(int setter);

    /**
     * Max average light level per frame (cd/m^2).
     */
    public native @Cast("unsigned") int MaxFALL(); public native AVContentLightMetadata MaxFALL(int setter);
}
