// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * This structure describes decoded (raw) audio or video data.
 *
 * AVFrame must be allocated using av_frame_alloc(). Note that this only
 * allocates the AVFrame itself, the buffers for the data must be managed
 * through other means (see below).
 * AVFrame must be freed with av_frame_free().
 *
 * AVFrame is typically allocated once and then reused multiple times to hold
 * different data (e.g. a single AVFrame to hold frames received from a
 * decoder). In such a case, av_frame_unref() will free any references held by
 * the frame and reset it to its original clean state before it
 * is reused again.
 *
 * The data described by an AVFrame is usually reference counted through the
 * AVBuffer API. The underlying buffer references are stored in AVFrame.buf /
 * AVFrame.extended_buf. An AVFrame is considered to be reference counted if at
 * least one reference is set, i.e. if AVFrame.buf[0] != NULL. In such a case,
 * every single data plane must be contained in one of the buffers in
 * AVFrame.buf or AVFrame.extended_buf.
 * There may be a single buffer for all the data, or one separate buffer for
 * each plane, or anything in between.
 *
 * sizeof(AVFrame) is not a part of the public ABI, so new fields may be added
 * to the end with a minor bump.
 *
 * Fields can be accessed through AVOptions, the name string used, matches the
 * C structure field name for fields accessible through AVOptions. The AVClass
 * for AVFrame can be obtained from avcodec_get_frame_class()
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVFrame extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFrame() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFrame(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFrame(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFrame position(long position) {
        return (AVFrame)super.position(position);
    }

public static final int AV_NUM_DATA_POINTERS = 8;
    /**
     * pointer to the picture/channel planes.
     * This might be different from the first allocated byte
     *
     * Some decoders access areas outside 0,0 - width,height, please
     * see avcodec_align_dimensions2(). Some filters and swscale can read
     * up to 16 bytes beyond the planes, if these filters are to be used,
     * then 16 extra bytes must be allocated.
     *
     * NOTE: Except for hwaccel formats, pointers not needed by the format
     * MUST be set to NULL.
     */
    public native @Cast("uint8_t*") BytePointer data(int i); public native AVFrame data(int i, BytePointer setter);
    @MemberGetter public native @Cast("uint8_t**") PointerPointer data();

    /**
     * For video, size in bytes of each picture line.
     * For audio, size in bytes of each plane.
     *
     * For audio, only linesize[0] may be set. For planar audio, each channel
     * plane must be the same size.
     *
     * For video the linesizes should be multiples of the CPUs alignment
     * preference, this is 16 or 32 for modern desktop CPUs.
     * Some code requires such alignment other code can be slower without
     * correct alignment, for yet other it makes no difference.
     *
     * \note The linesize may be larger than the size of usable data -- there
     * may be extra padding present for performance reasons.
     */
    public native int linesize(int i); public native AVFrame linesize(int i, int setter);
    @MemberGetter public native IntPointer linesize();

    /**
     * pointers to the data planes/channels.
     *
     * For video, this should simply point to data[].
     *
     * For planar audio, each channel has a separate data pointer, and
     * linesize[0] contains the size of each channel buffer.
     * For packed audio, there is just one data pointer, and linesize[0]
     * contains the total size of the buffer for all channels.
     *
     * Note: Both data and extended_data should always be set in a valid frame,
     * but for planar audio with more channels that can fit in data,
     * extended_data must be used in order to access all channels.
     */
    public native @Cast("uint8_t*") BytePointer extended_data(int i); public native AVFrame extended_data(int i, BytePointer setter);
    public native @Cast("uint8_t**") PointerPointer extended_data(); public native AVFrame extended_data(PointerPointer setter);

    /**
     * \name Video dimensions
     * Video frames only. The coded dimensions (in pixels) of the video frame,
     * i.e. the size of the rectangle that contains some well-defined values.
     *
     * \note The part of the frame intended for display/presentation is further
     * restricted by the \ref cropping "Cropping rectangle".
     * \{
     */
    public native int width(); public native AVFrame width(int setter);
    public native int height(); public native AVFrame height(int setter);
    /**
     * \}
     */

    /**
     * number of audio samples (per channel) described by this frame
     */
    public native int nb_samples(); public native AVFrame nb_samples(int setter);

    /**
     * format of the frame, -1 if unknown or unset
     * Values correspond to enum AVPixelFormat for video frames,
     * enum AVSampleFormat for audio)
     */
    public native int format(); public native AVFrame format(int setter);

    /**
     * 1 -> keyframe, 0-> not
     */
    public native int key_frame(); public native AVFrame key_frame(int setter);

    /**
     * Picture type of the frame.
     */
    public native @Cast("AVPictureType") int pict_type(); public native AVFrame pict_type(int setter);

    /**
     * Sample aspect ratio for the video frame, 0/1 if unknown/unspecified.
     */
    public native @ByRef AVRational sample_aspect_ratio(); public native AVFrame sample_aspect_ratio(AVRational setter);

    /**
     * Presentation timestamp in time_base units (time when frame should be shown to user).
     */
    public native @Cast("int64_t") long pts(); public native AVFrame pts(long setter);

// #if FF_API_PKT_PTS
    /**
     * PTS copied from the AVPacket that was decoded to produce this frame.
     * @deprecated use the pts field instead
     */
    public native @Cast("int64_t") @Deprecated long pkt_pts(); public native AVFrame pkt_pts(long setter);
// #endif

    /**
     * DTS copied from the AVPacket that triggered returning this frame. (if frame threading isn't used)
     * This is also the Presentation time of this AVFrame calculated from
     * only AVPacket.dts values without pts values.
     */
    public native @Cast("int64_t") long pkt_dts(); public native AVFrame pkt_dts(long setter);

    /**
     * picture number in bitstream order
     */
    public native int coded_picture_number(); public native AVFrame coded_picture_number(int setter);
    /**
     * picture number in display order
     */
    public native int display_picture_number(); public native AVFrame display_picture_number(int setter);

    /**
     * quality (between 1 (good) and FF_LAMBDA_MAX (bad))
     */
    public native int quality(); public native AVFrame quality(int setter);

    /**
     * for some private data of the user
     */
    public native Pointer opaque(); public native AVFrame opaque(Pointer setter);

// #if FF_API_ERROR_FRAME
    /**
     * @deprecated unused
     */
    public native @Cast("uint64_t") @Deprecated long error(int i); public native AVFrame error(int i, long setter);
    @MemberGetter public native @Cast("uint64_t*") @Deprecated LongPointer error();
// #endif

    /**
     * When decoding, this signals how much the picture must be delayed.
     * extra_delay = repeat_pict / (2*fps)
     */
    public native int repeat_pict(); public native AVFrame repeat_pict(int setter);

    /**
     * The content of the picture is interlaced.
     */
    public native int interlaced_frame(); public native AVFrame interlaced_frame(int setter);

    /**
     * If the content is interlaced, is top field displayed first.
     */
    public native int top_field_first(); public native AVFrame top_field_first(int setter);

    /**
     * Tell user application that palette has changed from previous frame.
     */
    public native int palette_has_changed(); public native AVFrame palette_has_changed(int setter);

    /**
     * reordered opaque 64 bits (generally an integer or a double precision float
     * PTS but can be anything).
     * The user sets AVCodecContext.reordered_opaque to represent the input at
     * that time,
     * the decoder reorders values as needed and sets AVFrame.reordered_opaque
     * to exactly one of the values provided by the user through AVCodecContext.reordered_opaque
     */
    public native @Cast("int64_t") long reordered_opaque(); public native AVFrame reordered_opaque(long setter);

    /**
     * Sample rate of the audio data.
     */
    public native int sample_rate(); public native AVFrame sample_rate(int setter);

    /**
     * Channel layout of the audio data.
     */
    public native @Cast("uint64_t") long channel_layout(); public native AVFrame channel_layout(long setter);

    /**
     * AVBuffer references backing the data for this frame. If all elements of
     * this array are NULL, then this frame is not reference counted. This array
     * must be filled contiguously -- if buf[i] is non-NULL then buf[j] must
     * also be non-NULL for all j < i.
     *
     * There may be at most one AVBuffer per data plane, so for video this array
     * always contains all the references. For planar audio with more than
     * AV_NUM_DATA_POINTERS channels, there may be more buffers than can fit in
     * this array. Then the extra AVBufferRef pointers are stored in the
     * extended_buf array.
     */
    public native AVBufferRef buf(int i); public native AVFrame buf(int i, AVBufferRef setter);
    @MemberGetter public native @Cast("AVBufferRef**") PointerPointer buf();

    /**
     * For planar audio which requires more than AV_NUM_DATA_POINTERS
     * AVBufferRef pointers, this array will hold all the references which
     * cannot fit into AVFrame.buf.
     *
     * Note that this is different from AVFrame.extended_data, which always
     * contains all the pointers. This array only contains the extra pointers,
     * which cannot fit into AVFrame.buf.
     *
     * This array is always allocated using av_malloc() by whoever constructs
     * the frame. It is freed in av_frame_unref().
     */
    public native AVBufferRef extended_buf(int i); public native AVFrame extended_buf(int i, AVBufferRef setter);
    public native @Cast("AVBufferRef**") PointerPointer extended_buf(); public native AVFrame extended_buf(PointerPointer setter);
    /**
     * Number of elements in extended_buf.
     */
    public native int nb_extended_buf(); public native AVFrame nb_extended_buf(int setter);

    public native AVFrameSideData side_data(int i); public native AVFrame side_data(int i, AVFrameSideData setter);
    public native @Cast("AVFrameSideData**") PointerPointer side_data(); public native AVFrame side_data(PointerPointer setter);
    public native int nb_side_data(); public native AVFrame nb_side_data(int setter);

/**
 * \defgroup lavu_frame_flags AV_FRAME_FLAGS
 * \ingroup lavu_frame
 * Flags describing additional frame properties.
 *
 * \{
 */

/**
 * The frame data may be corrupted, e.g. due to decoding errors.
 */
public static final int AV_FRAME_FLAG_CORRUPT =       (1 << 0);
/**
 * A flag to mark the frames which need to be decoded, but shouldn't be output.
 */
public static final int AV_FRAME_FLAG_DISCARD =   (1 << 2);
/**
 * \}
 */

    /**
     * Frame flags, a combination of \ref lavu_frame_flags
     */
    public native int flags(); public native AVFrame flags(int setter);

    /**
     * MPEG vs JPEG YUV range.
     * - encoding: Set by user
     * - decoding: Set by libavcodec
     */
    public native @Cast("AVColorRange") int color_range(); public native AVFrame color_range(int setter);

    public native @Cast("AVColorPrimaries") int color_primaries(); public native AVFrame color_primaries(int setter);

    public native @Cast("AVColorTransferCharacteristic") int color_trc(); public native AVFrame color_trc(int setter);

    /**
     * YUV colorspace type.
     * - encoding: Set by user
     * - decoding: Set by libavcodec
     */
    public native @Cast("AVColorSpace") int colorspace(); public native AVFrame colorspace(int setter);

    public native @Cast("AVChromaLocation") int chroma_location(); public native AVFrame chroma_location(int setter);

    /**
     * frame timestamp estimated using various heuristics, in stream time base
     * - encoding: unused
     * - decoding: set by libavcodec, read by user.
     */
    public native @Cast("int64_t") long best_effort_timestamp(); public native AVFrame best_effort_timestamp(long setter);

    /**
     * reordered pos from the last AVPacket that has been input into the decoder
     * - encoding: unused
     * - decoding: Read by user.
     */
    public native @Cast("int64_t") long pkt_pos(); public native AVFrame pkt_pos(long setter);

    /**
     * duration of the corresponding packet, expressed in
     * AVStream->time_base units, 0 if unknown.
     * - encoding: unused
     * - decoding: Read by user.
     */
    public native @Cast("int64_t") long pkt_duration(); public native AVFrame pkt_duration(long setter);

    /**
     * metadata.
     * - encoding: Set by user.
     * - decoding: Set by libavcodec.
     */
    public native AVDictionary metadata(); public native AVFrame metadata(AVDictionary setter);

    /**
     * decode error flags of the frame, set to a combination of
     * FF_DECODE_ERROR_xxx flags if the decoder produced a frame, but there
     * were errors during the decoding.
     * - encoding: unused
     * - decoding: set by libavcodec, read by user.
     */
    public native int decode_error_flags(); public native AVFrame decode_error_flags(int setter);
public static final int FF_DECODE_ERROR_INVALID_BITSTREAM =   1;
public static final int FF_DECODE_ERROR_MISSING_REFERENCE =   2;
public static final int FF_DECODE_ERROR_CONCEALMENT_ACTIVE =  4;
public static final int FF_DECODE_ERROR_DECODE_SLICES =       8;

    /**
     * number of audio channels, only used for audio.
     * - encoding: unused
     * - decoding: Read by user.
     */
    public native int channels(); public native AVFrame channels(int setter);

    /**
     * size of the corresponding packet containing the compressed
     * frame.
     * It is set to a negative value if unknown.
     * - encoding: unused
     * - decoding: set by libavcodec, read by user.
     */
    public native int pkt_size(); public native AVFrame pkt_size(int setter);

// #if FF_API_FRAME_QP
    /**
     * QP table
     */
    public native @Deprecated BytePointer qscale_table(); public native AVFrame qscale_table(BytePointer setter);
    /**
     * QP store stride
     */
    public native @Deprecated int qstride(); public native AVFrame qstride(int setter);

    public native @Deprecated int qscale_type(); public native AVFrame qscale_type(int setter);

    public native @Deprecated AVBufferRef qp_table_buf(); public native AVFrame qp_table_buf(AVBufferRef setter);
// #endif
    /**
     * For hwaccel-format frames, this should be a reference to the
     * AVHWFramesContext describing the frame.
     */
    public native AVBufferRef hw_frames_ctx(); public native AVFrame hw_frames_ctx(AVBufferRef setter);

    /**
     * AVBufferRef for free use by the API user. FFmpeg will never check the
     * contents of the buffer ref. FFmpeg calls av_buffer_unref() on it when
     * the frame is unreferenced. av_frame_copy_props() calls create a new
     * reference with av_buffer_ref() for the target frame's opaque_ref field.
     *
     * This is unrelated to the opaque field, although it serves a similar
     * purpose.
     */
    public native AVBufferRef opaque_ref(); public native AVFrame opaque_ref(AVBufferRef setter);

    /**
     * \anchor cropping
     * \name Cropping
     * Video frames only. The number of pixels to discard from the the
     * top/bottom/left/right border of the frame to obtain the sub-rectangle of
     * the frame intended for presentation.
     * \{
     */
    public native @Cast("size_t") long crop_top(); public native AVFrame crop_top(long setter);
    public native @Cast("size_t") long crop_bottom(); public native AVFrame crop_bottom(long setter);
    public native @Cast("size_t") long crop_left(); public native AVFrame crop_left(long setter);
    public native @Cast("size_t") long crop_right(); public native AVFrame crop_right(long setter);
    /**
     * \}
     */

    /**
     * AVBufferRef for internal use by a single libav* library.
     * Must not be used to transfer data between libraries.
     * Has to be NULL when ownership of the frame leaves the respective library.
     *
     * Code outside the FFmpeg libs should never check or change the contents of the buffer ref.
     *
     * FFmpeg calls av_buffer_unref() on it when the frame is unreferenced.
     * av_frame_copy_props() calls create a new reference with av_buffer_ref()
     * for the target frame's private_ref field.
     */
    public native AVBufferRef private_ref(); public native AVFrame private_ref(AVBufferRef setter);
}
