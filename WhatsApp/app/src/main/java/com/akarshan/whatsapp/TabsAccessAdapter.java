package com.akarshan.whatsapp;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by akarshan on 26-08-2019. To Acess the Fragment like group stauts and chats
 */

class TabsAccessAdapter extends FragmentPagerAdapter
{
    public TabsAccessAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                ChatsFragment chatsFragment=new ChatsFragment();
                return chatsFragment;
            case 1:
                GroupsFragment groupsFragment=new GroupsFragment();
                return groupsFragment;
            case 2:
                StutsFragment stutsFragment=new StutsFragment();
                return stutsFragment;
            default: return null;

        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:

                return "Chats";
            case 1:
                return "Status";
            case 2:
               return "Groups";
            default: return null;

        }
    }
}
