// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class Write_packet_Pointer_BytePointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Write_packet_Pointer_BytePointer_int(Pointer p) { super(p); }
    protected Write_packet_Pointer_BytePointer_int() { allocate(); }
    private native void allocate();
    public native int call(Pointer opaque, @Cast("uint8_t*") BytePointer buf, int buf_size);
}
