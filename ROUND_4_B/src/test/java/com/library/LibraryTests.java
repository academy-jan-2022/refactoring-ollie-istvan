package com.library;

import org.junit.Assert;
import org.junit.Test;


public class LibraryTests {

    @Test
    public void donatedTitlesAreAddedToLibraryWithOneDefaultCopy() {
        Library library = new Library();
        String titleName = "Jaws 3D";
        String donorId = "Jason123";
        Member donor = new Member(donorId);
        Title title = new Title(titleName, donor);
        library.donate(title);
        title = library.getTitles().get(titleName);
        Assert.assertEquals(titleName, title.getTitleName());
        Assert.assertEquals(donorId, title.getDonorId());
        Assert.assertEquals(1, title.getCopyCount());
        Assert.assertEquals(1, library.getTitlesDonatedByMember(donorId).size());
    }

}
