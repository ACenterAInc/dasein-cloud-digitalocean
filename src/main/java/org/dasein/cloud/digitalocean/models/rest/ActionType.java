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

package org.dasein.cloud.digitalocean.models.rest;

public enum ActionType {
	DROPLET, KEY, IMAGE;
	
	@Override
	public String toString() {
		switch(this) {
			case DROPLET:
				return "v2/droplets/%s/actions";
			case KEY:
				return "v2/account/keys/%s/actions";
            case IMAGE:
                return "v2/images/%s/actions";
			default:
				return "v2/????";
		}
	}
}

