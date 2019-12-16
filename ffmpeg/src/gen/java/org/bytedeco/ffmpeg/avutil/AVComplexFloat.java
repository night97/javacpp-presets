// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVComplexFloat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVComplexFloat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVComplexFloat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVComplexFloat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVComplexFloat position(long position) {
        return (AVComplexFloat)super.position(position);
    }

    public native float re(); public native AVComplexFloat re(float setter);
    public native float im(); public native AVComplexFloat im(float setter);
}
