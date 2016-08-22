package org.openstack4j.model.image.v2.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.image.v2.ContainerFormat;
import org.openstack4j.model.image.v2.DiskFormat;
import org.openstack4j.model.image.v2.Image;

import java.util.List;

/**
 * Builder which creates a v2 Image
 * @author emjburns
 */
public interface ImageBuilder extends Buildable.Builder<ImageBuilder, Image> {

    /**
     * @see Image#getName()
     */
    ImageBuilder name(String name);

    /**
     * @see Image#getId()
     */
    ImageBuilder id(String id);

    /**
     * @see Image#getVisibility()
     */
    ImageBuilder visibility(String visibility);

    /**
     * @see Image#getTags()
     */
    ImageBuilder tags(List<String> tags);

    /**
     * @see Image#getContainerFormat()
     */
    ImageBuilder containerFormat(ContainerFormat containerFormat);

    /**
     * @see Image#getDiskFormat()
     */
    ImageBuilder diskFormat(DiskFormat diskFormat);

    /**
     * @see Image#getMinDisk()
     */
    ImageBuilder minDisk(Integer minDisk);

    /**
     * @see Image#getMinRam()
     */
    ImageBuilder minRam(Integer minRam);

    /**
     * @see Image#getIsProtected()
     */
    ImageBuilder isProtected(Boolean isProtected);

    /**
     * @see Image#getProperties()
     */
    // TODO: fix type?
    ImageBuilder properties(String properties);
}
