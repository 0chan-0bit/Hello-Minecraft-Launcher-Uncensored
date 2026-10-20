/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2020  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl.upgrade;

/// Reports whether the current launcher installation should be treated as trusted.
///
/// The self-integrity check has been removed from this build, so every installation is
/// reported as verified and official. The class is kept because account login still gates
/// external authentication on [#isOfficial].
///
/// @author yushijinhun
public final class IntegrityChecker {
    private IntegrityChecker() {}

    /// Always returns `true` because self-integrity checking has been removed.
    public static boolean isSelfVerified() {
        return true;
    }

    /// Always returns `true` because self-integrity checking has been removed.
    public static boolean isOfficial() {
        return true;
    }
}
