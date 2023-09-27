/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows images of a format that requires <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">Y′C<sub>B</sub>C<sub>R</sub> conversion</a> to be created with multiple array layers, which is otherwise restricted.
 * 
 * <h5>VK_EXT_ycbcr_image_arrays</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_ycbcr_image_arrays}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>253</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRSamplerYcbcrConversion VK_KHR_sampler_ycbcr_conversion} or <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_ycbcr_image_arrays]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_ycbcr_image_arrays%20extension*">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-01-15</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTYcbcrImageArrays {

    /** The extension specification version. */
    public static final int VK_EXT_YCBCR_IMAGE_ARRAYS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_YCBCR_IMAGE_ARRAYS_EXTENSION_NAME = "VK_EXT_ycbcr_image_arrays";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT = 1000252000;

    private EXTYcbcrImageArrays() {}

}