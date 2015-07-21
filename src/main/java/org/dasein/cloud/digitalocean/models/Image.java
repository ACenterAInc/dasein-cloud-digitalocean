/**
 * Copyright (C) 2012-2015 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.digitalocean.models;

import com.google.gson.annotations.SerializedName;
import org.dasein.cloud.digitalocean.models.rest.DigitalOceanRestModel;
	
public class Image implements DigitalOceanRestModel {
	String id;
	String slug;
	String name;
	String distribution;
    @SerializedName("public")
	Boolean isPublic;
	String[] regions;
    @SerializedName("min_disk_size")
    long minDiskSize;
	
	public String getId() {
		return this.id;
	}
	
	public String getSlug() {
		return this.slug;
	}		
	
	public void setSlug(String s) {
		this.slug = s;
	}		

	public String getName() {
		return this.name;
	}
	public void setName(String b) {
		this.name = b;
	}
	public void setPublic(boolean b) {
		this.isPublic = b;
	}
	public boolean getPublic() {
		return this.isPublic;
	}


	public String[] getRegions() {
		return this.regions;
	}
	
	public void setRegions(String[] r) {
		this.regions = r;
	}
	public String getDistribution() {
		return this.distribution;
	}
	public void setDistribution(String b) {
		this.distribution = b;
	}

    public long getMinDiskSize() { return this.minDiskSize; }
    public void setMinDiskSize(long l) { this.minDiskSize = l; }
	
}
