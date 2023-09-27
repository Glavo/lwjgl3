/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_KERNEL_NODE_PARAMS {
 *     CUfunction func;
 *     unsigned int gridDimX;
 *     unsigned int gridDimY;
 *     unsigned int gridDimZ;
 *     unsigned int blockDimX;
 *     unsigned int blockDimY;
 *     unsigned int blockDimZ;
 *     unsigned int sharedMemBytes;
 *     void ** kernelParams;
 *     void ** extra;
 * }</code></pre>
 */
public class CUDA_KERNEL_NODE_PARAMS extends Struct<CUDA_KERNEL_NODE_PARAMS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FUNC,
        GRIDDIMX,
        GRIDDIMY,
        GRIDDIMZ,
        BLOCKDIMX,
        BLOCKDIMY,
        BLOCKDIMZ,
        SHAREDMEMBYTES,
        KERNELPARAMS,
        EXTRA;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FUNC = layout.offsetof(0);
        GRIDDIMX = layout.offsetof(1);
        GRIDDIMY = layout.offsetof(2);
        GRIDDIMZ = layout.offsetof(3);
        BLOCKDIMX = layout.offsetof(4);
        BLOCKDIMY = layout.offsetof(5);
        BLOCKDIMZ = layout.offsetof(6);
        SHAREDMEMBYTES = layout.offsetof(7);
        KERNELPARAMS = layout.offsetof(8);
        EXTRA = layout.offsetof(9);
    }

    protected CUDA_KERNEL_NODE_PARAMS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_KERNEL_NODE_PARAMS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_KERNEL_NODE_PARAMS(address, container);
    }

    /**
     * Creates a {@code CUDA_KERNEL_NODE_PARAMS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_KERNEL_NODE_PARAMS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code func} field. */
    @NativeType("CUfunction")
    public long func() { return nfunc(address()); }
    /** @return the value of the {@code gridDimX} field. */
    @NativeType("unsigned int")
    public int gridDimX() { return ngridDimX(address()); }
    /** @return the value of the {@code gridDimY} field. */
    @NativeType("unsigned int")
    public int gridDimY() { return ngridDimY(address()); }
    /** @return the value of the {@code gridDimZ} field. */
    @NativeType("unsigned int")
    public int gridDimZ() { return ngridDimZ(address()); }
    /** @return the value of the {@code blockDimX} field. */
    @NativeType("unsigned int")
    public int blockDimX() { return nblockDimX(address()); }
    /** @return the value of the {@code blockDimY} field. */
    @NativeType("unsigned int")
    public int blockDimY() { return nblockDimY(address()); }
    /** @return the value of the {@code blockDimZ} field. */
    @NativeType("unsigned int")
    public int blockDimZ() { return nblockDimZ(address()); }
    /** @return the value of the {@code sharedMemBytes} field. */
    @NativeType("unsigned int")
    public int sharedMemBytes() { return nsharedMemBytes(address()); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void **")
    public PointerBuffer kernelParams(int capacity) { return nkernelParams(address(), capacity); }
    /**
     * @return a {@link PointerBuffer} view of the data pointed to by the {@code extra} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("void **")
    public PointerBuffer extra(int capacity) { return nextra(address(), capacity); }

    /** Sets the specified value to the {@code func} field. */
    public CUDA_KERNEL_NODE_PARAMS func(@NativeType("CUfunction") long value) { nfunc(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimX} field. */
    public CUDA_KERNEL_NODE_PARAMS gridDimX(@NativeType("unsigned int") int value) { ngridDimX(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimY} field. */
    public CUDA_KERNEL_NODE_PARAMS gridDimY(@NativeType("unsigned int") int value) { ngridDimY(address(), value); return this; }
    /** Sets the specified value to the {@code gridDimZ} field. */
    public CUDA_KERNEL_NODE_PARAMS gridDimZ(@NativeType("unsigned int") int value) { ngridDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimX} field. */
    public CUDA_KERNEL_NODE_PARAMS blockDimX(@NativeType("unsigned int") int value) { nblockDimX(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimY} field. */
    public CUDA_KERNEL_NODE_PARAMS blockDimY(@NativeType("unsigned int") int value) { nblockDimY(address(), value); return this; }
    /** Sets the specified value to the {@code blockDimZ} field. */
    public CUDA_KERNEL_NODE_PARAMS blockDimZ(@NativeType("unsigned int") int value) { nblockDimZ(address(), value); return this; }
    /** Sets the specified value to the {@code sharedMemBytes} field. */
    public CUDA_KERNEL_NODE_PARAMS sharedMemBytes(@NativeType("unsigned int") int value) { nsharedMemBytes(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
    public CUDA_KERNEL_NODE_PARAMS kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { nkernelParams(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code extra} field. */
    public CUDA_KERNEL_NODE_PARAMS extra(@Nullable @NativeType("void **") PointerBuffer value) { nextra(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_KERNEL_NODE_PARAMS set(
        long func,
        int gridDimX,
        int gridDimY,
        int gridDimZ,
        int blockDimX,
        int blockDimY,
        int blockDimZ,
        int sharedMemBytes,
        @Nullable PointerBuffer kernelParams,
        @Nullable PointerBuffer extra
    ) {
        func(func);
        gridDimX(gridDimX);
        gridDimY(gridDimY);
        gridDimZ(gridDimZ);
        blockDimX(blockDimX);
        blockDimY(blockDimY);
        blockDimZ(blockDimZ);
        sharedMemBytes(sharedMemBytes);
        kernelParams(kernelParams);
        extra(extra);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_KERNEL_NODE_PARAMS set(CUDA_KERNEL_NODE_PARAMS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_KERNEL_NODE_PARAMS malloc() {
        return new CUDA_KERNEL_NODE_PARAMS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_KERNEL_NODE_PARAMS calloc() {
        return new CUDA_KERNEL_NODE_PARAMS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS} instance allocated with {@link BufferUtils}. */
    public static CUDA_KERNEL_NODE_PARAMS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_KERNEL_NODE_PARAMS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_KERNEL_NODE_PARAMS} instance for the specified memory address. */
    public static CUDA_KERNEL_NODE_PARAMS create(long address) {
        return new CUDA_KERNEL_NODE_PARAMS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_KERNEL_NODE_PARAMS createSafe(long address) {
        return address == NULL ? null : new CUDA_KERNEL_NODE_PARAMS(address, null);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_KERNEL_NODE_PARAMS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_KERNEL_NODE_PARAMS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_KERNEL_NODE_PARAMS.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_KERNEL_NODE_PARAMS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_KERNEL_NODE_PARAMS malloc(MemoryStack stack) {
        return new CUDA_KERNEL_NODE_PARAMS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_KERNEL_NODE_PARAMS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_KERNEL_NODE_PARAMS calloc(MemoryStack stack) {
        return new CUDA_KERNEL_NODE_PARAMS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_KERNEL_NODE_PARAMS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_KERNEL_NODE_PARAMS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #func}. */
    public static long nfunc(long struct) { return memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS.FUNC); }
    /** Unsafe version of {@link #gridDimX}. */
    public static int ngridDimX(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS.GRIDDIMX); }
    /** Unsafe version of {@link #gridDimY}. */
    public static int ngridDimY(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS.GRIDDIMY); }
    /** Unsafe version of {@link #gridDimZ}. */
    public static int ngridDimZ(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS.GRIDDIMZ); }
    /** Unsafe version of {@link #blockDimX}. */
    public static int nblockDimX(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS.BLOCKDIMX); }
    /** Unsafe version of {@link #blockDimY}. */
    public static int nblockDimY(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS.BLOCKDIMY); }
    /** Unsafe version of {@link #blockDimZ}. */
    public static int nblockDimZ(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS.BLOCKDIMZ); }
    /** Unsafe version of {@link #sharedMemBytes}. */
    public static int nsharedMemBytes(long struct) { return UNSAFE.getInt(null, struct + CUDA_KERNEL_NODE_PARAMS.SHAREDMEMBYTES); }
    /** Unsafe version of {@link #kernelParams(int) kernelParams}. */
    @Nullable public static PointerBuffer nkernelParams(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS.KERNELPARAMS), capacity); }
    /** Unsafe version of {@link #extra(int) extra}. */
    @Nullable public static PointerBuffer nextra(long struct, int capacity) { return memPointerBufferSafe(memGetAddress(struct + CUDA_KERNEL_NODE_PARAMS.EXTRA), capacity); }

    /** Unsafe version of {@link #func(long) func}. */
    public static void nfunc(long struct, long value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS.FUNC, value); }
    /** Unsafe version of {@link #gridDimX(int) gridDimX}. */
    public static void ngridDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS.GRIDDIMX, value); }
    /** Unsafe version of {@link #gridDimY(int) gridDimY}. */
    public static void ngridDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS.GRIDDIMY, value); }
    /** Unsafe version of {@link #gridDimZ(int) gridDimZ}. */
    public static void ngridDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS.GRIDDIMZ, value); }
    /** Unsafe version of {@link #blockDimX(int) blockDimX}. */
    public static void nblockDimX(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS.BLOCKDIMX, value); }
    /** Unsafe version of {@link #blockDimY(int) blockDimY}. */
    public static void nblockDimY(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS.BLOCKDIMY, value); }
    /** Unsafe version of {@link #blockDimZ(int) blockDimZ}. */
    public static void nblockDimZ(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS.BLOCKDIMZ, value); }
    /** Unsafe version of {@link #sharedMemBytes(int) sharedMemBytes}. */
    public static void nsharedMemBytes(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_KERNEL_NODE_PARAMS.SHAREDMEMBYTES, value); }
    /** Unsafe version of {@link #kernelParams(PointerBuffer) kernelParams}. */
    public static void nkernelParams(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS.KERNELPARAMS, memAddressSafe(value)); }
    /** Unsafe version of {@link #extra(PointerBuffer) extra}. */
    public static void nextra(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + CUDA_KERNEL_NODE_PARAMS.EXTRA, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link CUDA_KERNEL_NODE_PARAMS} structs. */
    public static class Buffer extends StructBuffer<CUDA_KERNEL_NODE_PARAMS, Buffer> implements NativeResource {

        private static final CUDA_KERNEL_NODE_PARAMS ELEMENT_FACTORY = CUDA_KERNEL_NODE_PARAMS.create(-1L);

        /**
         * Creates a new {@code CUDA_KERNEL_NODE_PARAMS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_KERNEL_NODE_PARAMS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_KERNEL_NODE_PARAMS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code func} field. */
        @NativeType("CUfunction")
        public long func() { return CUDA_KERNEL_NODE_PARAMS.nfunc(address()); }
        /** @return the value of the {@code gridDimX} field. */
        @NativeType("unsigned int")
        public int gridDimX() { return CUDA_KERNEL_NODE_PARAMS.ngridDimX(address()); }
        /** @return the value of the {@code gridDimY} field. */
        @NativeType("unsigned int")
        public int gridDimY() { return CUDA_KERNEL_NODE_PARAMS.ngridDimY(address()); }
        /** @return the value of the {@code gridDimZ} field. */
        @NativeType("unsigned int")
        public int gridDimZ() { return CUDA_KERNEL_NODE_PARAMS.ngridDimZ(address()); }
        /** @return the value of the {@code blockDimX} field. */
        @NativeType("unsigned int")
        public int blockDimX() { return CUDA_KERNEL_NODE_PARAMS.nblockDimX(address()); }
        /** @return the value of the {@code blockDimY} field. */
        @NativeType("unsigned int")
        public int blockDimY() { return CUDA_KERNEL_NODE_PARAMS.nblockDimY(address()); }
        /** @return the value of the {@code blockDimZ} field. */
        @NativeType("unsigned int")
        public int blockDimZ() { return CUDA_KERNEL_NODE_PARAMS.nblockDimZ(address()); }
        /** @return the value of the {@code sharedMemBytes} field. */
        @NativeType("unsigned int")
        public int sharedMemBytes() { return CUDA_KERNEL_NODE_PARAMS.nsharedMemBytes(address()); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code kernelParams} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void **")
        public PointerBuffer kernelParams(int capacity) { return CUDA_KERNEL_NODE_PARAMS.nkernelParams(address(), capacity); }
        /**
         * @return a {@link PointerBuffer} view of the data pointed to by the {@code extra} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void **")
        public PointerBuffer extra(int capacity) { return CUDA_KERNEL_NODE_PARAMS.nextra(address(), capacity); }

        /** Sets the specified value to the {@code func} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer func(@NativeType("CUfunction") long value) { CUDA_KERNEL_NODE_PARAMS.nfunc(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimX} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer gridDimX(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS.ngridDimX(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimY} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer gridDimY(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS.ngridDimY(address(), value); return this; }
        /** Sets the specified value to the {@code gridDimZ} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer gridDimZ(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS.ngridDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimX} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer blockDimX(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS.nblockDimX(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimY} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer blockDimY(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS.nblockDimY(address(), value); return this; }
        /** Sets the specified value to the {@code blockDimZ} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer blockDimZ(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS.nblockDimZ(address(), value); return this; }
        /** Sets the specified value to the {@code sharedMemBytes} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer sharedMemBytes(@NativeType("unsigned int") int value) { CUDA_KERNEL_NODE_PARAMS.nsharedMemBytes(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code kernelParams} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer kernelParams(@Nullable @NativeType("void **") PointerBuffer value) { CUDA_KERNEL_NODE_PARAMS.nkernelParams(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code extra} field. */
        public CUDA_KERNEL_NODE_PARAMS.Buffer extra(@Nullable @NativeType("void **") PointerBuffer value) { CUDA_KERNEL_NODE_PARAMS.nextra(address(), value); return this; }

    }

}