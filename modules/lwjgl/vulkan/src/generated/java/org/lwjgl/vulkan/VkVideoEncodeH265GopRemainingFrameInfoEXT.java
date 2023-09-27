/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying H.265 encode rate control GOP remaining frame counts.
 * 
 * <h5>Description</h5>
 * 
 * <p>Setting {@code useGopRemainingFrames} to {@link VK10#VK_TRUE TRUE} and including this structure in the {@code pNext} chain of {@link VkVideoEncodeInfoKHR} is only mandatory if the {@link VkVideoEncodeH265CapabilitiesEXT}{@code ::requiresGopRemainingFrames} reported for the used <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#video-profiles">video profile</a> is {@link VK10#VK_TRUE TRUE}. However, implementations <b>may</b> use these remaining frame counts, when specified, even when it is not required. In particular, when the application does not use a regular GOP structure, these values <b>may</b> provide additional guidance for the implementation’s rate control algorithm.</p>
 * 
 * <p>The {@link VkVideoEncodeH265CapabilitiesEXT}{@code ::prefersGopRemainingFrames} capability is also used to indicate that the implementation’s rate control algorithm <b>may</b> operate more accurately if the application specifies the remaining frame counts using this structure.</p>
 * 
 * <p>As with other rate control guidance values, if the effective order and number of frames encoded by the application are not in line with the remaining frame counts specified in this structure at any given point, then the behavior of the implementation’s rate control algorithm <b>may</b> deviate from the one expected by the application.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeH265GopRemainingFrameInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #useGopRemainingFrames};
 *     uint32_t {@link #gopRemainingI};
 *     uint32_t {@link #gopRemainingP};
 *     uint32_t {@link #gopRemainingB};
 * }</code></pre>
 */
public class VkVideoEncodeH265GopRemainingFrameInfoEXT extends Struct<VkVideoEncodeH265GopRemainingFrameInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USEGOPREMAININGFRAMES,
        GOPREMAININGI,
        GOPREMAININGP,
        GOPREMAININGB;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEGOPREMAININGFRAMES = layout.offsetof(2);
        GOPREMAININGI = layout.offsetof(3);
        GOPREMAININGP = layout.offsetof(4);
        GOPREMAININGB = layout.offsetof(5);
    }

    protected VkVideoEncodeH265GopRemainingFrameInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeH265GopRemainingFrameInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeH265GopRemainingFrameInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation’s rate control algorithm <b>should</b> use the values specified in {@code gopRemainingI}, {@code gopRemainingP}, and {@code gopRemainingB}. If {@code useGopRemainingFrames} is {@link VK10#VK_FALSE FALSE}, then the values of {@code gopRemainingI}, {@code gopRemainingP}, and {@code gopRemainingB} are ignored. */
    @NativeType("VkBool32")
    public boolean useGopRemainingFrames() { return nuseGopRemainingFrames(address()) != 0; }
    /** specifies the number of I-frames the implementation’s rate control algorithm <b>should</b> assume to be remaining in the GOP prior to executing the video encode operation. */
    @NativeType("uint32_t")
    public int gopRemainingI() { return ngopRemainingI(address()); }
    /** specifies the number of P-frames the implementation’s rate control algorithm <b>should</b> assume to be remaining in the GOP prior to executing the video encode operation. */
    @NativeType("uint32_t")
    public int gopRemainingP() { return ngopRemainingP(address()); }
    /** specifies the number of B-frames the implementation’s rate control algorithm <b>should</b> assume to be remaining in the GOP prior to executing the video encode operation. */
    @NativeType("uint32_t")
    public int gopRemainingB() { return ngopRemainingB(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT} value to the {@link #sType} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #useGopRemainingFrames} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT useGopRemainingFrames(@NativeType("VkBool32") boolean value) { nuseGopRemainingFrames(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #gopRemainingI} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT gopRemainingI(@NativeType("uint32_t") int value) { ngopRemainingI(address(), value); return this; }
    /** Sets the specified value to the {@link #gopRemainingP} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT gopRemainingP(@NativeType("uint32_t") int value) { ngopRemainingP(address(), value); return this; }
    /** Sets the specified value to the {@link #gopRemainingB} field. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT gopRemainingB(@NativeType("uint32_t") int value) { ngopRemainingB(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT set(
        int sType,
        long pNext,
        boolean useGopRemainingFrames,
        int gopRemainingI,
        int gopRemainingP,
        int gopRemainingB
    ) {
        sType(sType);
        pNext(pNext);
        useGopRemainingFrames(useGopRemainingFrames);
        gopRemainingI(gopRemainingI);
        gopRemainingP(gopRemainingP);
        gopRemainingB(gopRemainingB);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeH265GopRemainingFrameInfoEXT set(VkVideoEncodeH265GopRemainingFrameInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT malloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT calloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoEXT} instance for the specified memory address. */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT create(long address) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeH265GopRemainingFrameInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeH265GopRemainingFrameInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.PNEXT); }
    /** Unsafe version of {@link #useGopRemainingFrames}. */
    public static int nuseGopRemainingFrames(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.USEGOPREMAININGFRAMES); }
    /** Unsafe version of {@link #gopRemainingI}. */
    public static int ngopRemainingI(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.GOPREMAININGI); }
    /** Unsafe version of {@link #gopRemainingP}. */
    public static int ngopRemainingP(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.GOPREMAININGP); }
    /** Unsafe version of {@link #gopRemainingB}. */
    public static int ngopRemainingB(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.GOPREMAININGB); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #useGopRemainingFrames(boolean) useGopRemainingFrames}. */
    public static void nuseGopRemainingFrames(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.USEGOPREMAININGFRAMES, value); }
    /** Unsafe version of {@link #gopRemainingI(int) gopRemainingI}. */
    public static void ngopRemainingI(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.GOPREMAININGI, value); }
    /** Unsafe version of {@link #gopRemainingP(int) gopRemainingP}. */
    public static void ngopRemainingP(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.GOPREMAININGP, value); }
    /** Unsafe version of {@link #gopRemainingB(int) gopRemainingB}. */
    public static void ngopRemainingB(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeH265GopRemainingFrameInfoEXT.GOPREMAININGB, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeH265GopRemainingFrameInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265GopRemainingFrameInfoEXT, Buffer> implements NativeResource {

        private static final VkVideoEncodeH265GopRemainingFrameInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265GopRemainingFrameInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkVideoEncodeH265GopRemainingFrameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeH265GopRemainingFrameInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeH265GopRemainingFrameInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#useGopRemainingFrames} field. */
        @NativeType("VkBool32")
        public boolean useGopRemainingFrames() { return VkVideoEncodeH265GopRemainingFrameInfoEXT.nuseGopRemainingFrames(address()) != 0; }
        /** @return the value of the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#gopRemainingI} field. */
        @NativeType("uint32_t")
        public int gopRemainingI() { return VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingI(address()); }
        /** @return the value of the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#gopRemainingP} field. */
        @NativeType("uint32_t")
        public int gopRemainingP() { return VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingP(address()); }
        /** @return the value of the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#gopRemainingB} field. */
        @NativeType("uint32_t")
        public int gopRemainingB() { return VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingB(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#sType} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeH265GopRemainingFrameInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTVideoEncodeH265#VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT} value to the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#sType} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer sType$Default() { return sType(EXTVideoEncodeH265.VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_GOP_REMAINING_FRAME_INFO_EXT); }
        /** Sets the specified value to the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#pNext} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeH265GopRemainingFrameInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#useGopRemainingFrames} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer useGopRemainingFrames(@NativeType("VkBool32") boolean value) { VkVideoEncodeH265GopRemainingFrameInfoEXT.nuseGopRemainingFrames(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#gopRemainingI} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer gopRemainingI(@NativeType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingI(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#gopRemainingP} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer gopRemainingP(@NativeType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingP(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeH265GopRemainingFrameInfoEXT#gopRemainingB} field. */
        public VkVideoEncodeH265GopRemainingFrameInfoEXT.Buffer gopRemainingB(@NativeType("uint32_t") int value) { VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingB(address(), value); return this; }

    }

}