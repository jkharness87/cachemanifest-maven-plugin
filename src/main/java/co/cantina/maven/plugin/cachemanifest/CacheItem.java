package co.cantina.maven.plugin.cachemanifest;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CacheItem {

    private String applicationContextName;
    /**
     * The directory to iterate over.
     *
     * @required
     * @parameter
     */
    private File inputDirectory;
    /**
     * A list of inclusion filters for the manifest.  If none are provided,
     * will use all files.
     *
     * @parameter
     */
    private Set<String> includes = new HashSet<String>();
    /**
     * A list of exclusion filters for the manifest.
     *
     * @parameter
     */
    private Set<String> excludes = new HashSet<String>();
    /**
     *
     * A list of non-static resources that cannot be discovered
     * by crawling the file system.
     *
     * @parameter
     */
    private List<String> dynamicResources = new ArrayList<String>();

    /**
     * @return the applicationContextName
     */
    public String getApplicationContextName() {
        return applicationContextName;
    }

    /**
     * @param applicationContextName the applicationContextName to set
     */
    public void setApplicationContextName(String applicationContextName) {
        this.applicationContextName = applicationContextName;
    }

    /**
     * @return the inputDirectory
     */
    public File getInputDirectory() {
        return inputDirectory;
    }

    /**
     * @param inputDirectory the inputDirectory to set
     */
    public void setInputDirectory(File inputDirectory) {
        this.inputDirectory = inputDirectory;
    }

    /**
     * @return the includes
     */
    public Set<String> getIncludes() {
        return includes;
    }

    /**
     * @param includes the includes to set
     */
    public void setIncludes(Set<String> includes) {
        this.includes = includes;
    }

    /**
     * @return the excludes
     */
    public Set<String> getExcludes() {
        return excludes;
    }

    /**
     * @param excludes the excludes to set
     */
    public void setExcludes(Set<String> excludes) {
        this.excludes = excludes;
    }

    /**
     * @return the dynamicResources
     */
    public List<String> getDynamicResources() {
        return dynamicResources;
    }

    /**
     * @param dynamicResources the dynamicResources to set
     */
    public void setDynamicResources(List<String> dynamicResources) {
        this.dynamicResources = dynamicResources;
    }
}
