/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.view.hive.resources.uploads;

import org.apache.ambari.view.hive.client.ColumnDescription;

import java.io.Serializable;

public class ColumnDescriptionImpl implements ColumnDescription, Serializable {
  private String name;
  private String type;
  private int position;

  public ColumnDescriptionImpl(String name, String type, int position) {
    this.name = name;
    this.type = type;
    this.position = position;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public int getPosition() {
    return this.position;
  }

  @Override
  public void setPosition(int position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ColumnDescriptionImpl that = (ColumnDescriptionImpl) o;

    if (position != that.position) return false;
    if (!name.equals(that.name)) return false;
    return type.equals(that.type);

  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + type.hashCode();
    result = 31 * result + position;
    return result;
  }

  @Override
  public String toString() {
    return new StringBuilder().append("ColumnDescriptionImpl[")
            .append("name : ").append(name)
            .append("type : " + type)
            .append("position : " + position)
            .append("]").toString();
  }
}
