/**
 * @file
 * @brief BackupMode.
 *
 * Copyright (C) 2009,2010 Cybozu Inc., all rights reserved.
 *
 * @author Takashi HOSHINO <hoshino@labs.cybozu.co.jp>
 */
package com.cybozu.vmbkp.util;

/**
 * @brief Backup mode.
 *
 *   FULL: full.
 *   DIFF: differential.
 *   INCR: incremental.
 *   DELTA: incremental
 *   UNKNOWN: null value.
 */
public enum BackupMode {
    FULL, DELTA, DIFF, INCR, UNKNOWN;


    public static BackupMode parse(String modeStr) {

        if (modeStr.equals("full")) { return FULL; }
        else if (modeStr.equals("diff")) { return DIFF; }
        else if (modeStr.equals("incr")) { return INCR; }
        else if (modeStr.equals("delta")) { return DELTA; }
        else { return UNKNOWN; }
    }

    public String toString() {

        String ret = "unknown";
        switch (this) {
        case FULL:  ret = "full";  break;
        case DIFF:  ret = "diff";  break;
        case INCR:  ret = "incr";  break;
        case DELTA: ret = "delta"; break;
        }

        return ret;
    }
}

