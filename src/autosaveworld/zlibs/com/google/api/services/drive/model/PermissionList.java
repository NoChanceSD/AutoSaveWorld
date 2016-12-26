/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-10-17 16:43:55 UTC)
 * on 2016-11-17 at 13:55:42 UTC 
 * Modify at your own risk.
 */

package autosaveworld.zlibs.com.google.api.services.drive.model;

/**
 * A list of permissions associated with a file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PermissionList extends autosaveworld.zlibs.com.google.api.client.json.GenericJson {

  /**
   * The ETag of the list.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The actual list of permissions.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.util.List<Permission> items;

  static {
    // hack to force ProGuard to consider Permission used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    autosaveworld.zlibs.com.google.api.client.util.Data.nullOf(Permission.class);
  }

  /**
   * This is always drive#permissionList.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A link back to this list.
   * The value may be {@code null}.
   */
  @autosaveworld.zlibs.com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The ETag of the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The ETag of the list.
   * @param etag etag or {@code null} for none
   */
  public PermissionList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The actual list of permissions.
   * @return value or {@code null} for none
   */
  public java.util.List<Permission> getItems() {
    return items;
  }

  /**
   * The actual list of permissions.
   * @param items items or {@code null} for none
   */
  public PermissionList setItems(java.util.List<Permission> items) {
    this.items = items;
    return this;
  }

  /**
   * This is always drive#permissionList.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#permissionList.
   * @param kind kind or {@code null} for none
   */
  public PermissionList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A link back to this list.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this list.
   * @param selfLink selfLink or {@code null} for none
   */
  public PermissionList setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public PermissionList set(String fieldName, Object value) {
    return (PermissionList) super.set(fieldName, value);
  }

  @Override
  public PermissionList clone() {
    return (PermissionList) super.clone();
  }

}