/*
 * Copyright (c) 2016 Boyter Online Services
 *
 * Use of this software is governed by the Fair Source License included
 * in the LICENSE.TXT file
 *
 * After the following date 27 August 2019 this software version '1.2.3' or '1.2.4' is dual licenced under the
 * Fair Source Licence included in the LICENSE.txt file or under the GNU General Public License Version 3 with terms
 * specified at https://www.gnu.org/licenses/gpl-3.0.txt
 */


package com.searchcode.app.dto;


public class CodeOwner {

    private int noLines;
    private String name;
    private int mostRecentUnixCommitTimestamp;

    public CodeOwner(String name, int noLines, int mostRecentUnixCommitTimestamp) {
        this.setName(name);
        this.setNoLines(noLines);
        this.setMostRecentUnixCommitTimestamp(mostRecentUnixCommitTimestamp);
    }

    public void incrementLines() {
        this.noLines++;
    }

    public int getNoLines() {
        return noLines;
    }

    public void setNoLines(int noLines) {
        this.noLines = noLines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMostRecentUnixCommitTimestamp() {
        return mostRecentUnixCommitTimestamp;
    }

    public void setMostRecentUnixCommitTimestamp(int mostRecentUnixCommitTimestamp) {
        this.mostRecentUnixCommitTimestamp = mostRecentUnixCommitTimestamp;
    }
}
