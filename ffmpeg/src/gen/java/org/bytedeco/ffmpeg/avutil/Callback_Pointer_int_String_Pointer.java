// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Callback_Pointer_int_String_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Callback_Pointer_int_String_Pointer(Pointer p) { super(p); }
    protected Callback_Pointer_int_String_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, int arg1, String arg2, @ByVal @Cast("va_list*") Pointer arg3);
}
