/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.hugo.billing;


import org.springframework.util.Assert;

/**
 *
 */
public class ThreadLocalContextUtil {

    private static final ThreadLocal<MifosPlatformTenant> contextHolder = new ThreadLocal<MifosPlatformTenant>();

    public static void setTenant(final MifosPlatformTenant tenant) {
        Assert.notNull(tenant, "tenant cannot be null");
        contextHolder.set(tenant);
    }

    public static MifosPlatformTenant getTenant() {
        return contextHolder.get();
    }

    public static void clearTenant() {
        contextHolder.remove();
    }
}