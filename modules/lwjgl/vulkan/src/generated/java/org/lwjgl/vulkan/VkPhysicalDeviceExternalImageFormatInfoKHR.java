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
 * See {@link VkPhysicalDeviceExternalImageFormatInfo}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceExternalImageFormatInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkExternalMemoryHandleTypeFlagBits handleType;
 * }</code></pre>
 */
public class VkPhysicalDeviceExternalImageFormatInfoKHR extends VkPhysicalDeviceExternalImageFormatInfo {

    protected VkPhysicalDeviceExternalImageFormatInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceExternalImageFormatInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceExternalImageFormatInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceExternalImageFormatInfoKHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceExternalImageFormatInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO} value to the {@code sType} field. */
    @Override
    public VkPhysicalDeviceExternalImageFormatInfoKHR sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkPhysicalDeviceExternalImageFormatInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code handleType} field. */
    @Override
    public VkPhysicalDeviceExternalImageFormatInfoKHR handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { nhandleType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkPhysicalDeviceExternalImageFormatInfoKHR set(
        int sType,
        long pNext,
        int handleType
    ) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceExternalImageFormatInfoKHR set(VkPhysicalDeviceExternalImageFormatInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceExternalImageFormatInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR malloc() {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalImageFormatInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR calloc() {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalImageFormatInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceExternalImageFormatInfoKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR create(long address) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalImageFormatInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceExternalImageFormatInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalImageFormatInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceExternalImageFormatInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalImageFormatInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceExternalImageFormatInfoKHR} structs. */
    public static class Buffer extends VkPhysicalDeviceExternalImageFormatInfo.Buffer {

        private static final VkPhysicalDeviceExternalImageFormatInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceExternalImageFormatInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceExternalImageFormatInfoKHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected VkPhysicalDeviceExternalImageFormatInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceExternalImageFormatInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO} value to the {@code sType} field. */
        @Override
        public VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceExternalImageFormatInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code handleType} field. */
        @Override
        public VkPhysicalDeviceExternalImageFormatInfoKHR.Buffer handleType(@NativeType("VkExternalMemoryHandleTypeFlagBits") int value) { VkPhysicalDeviceExternalImageFormatInfoKHR.nhandleType(address(), value); return this; }

    }

}