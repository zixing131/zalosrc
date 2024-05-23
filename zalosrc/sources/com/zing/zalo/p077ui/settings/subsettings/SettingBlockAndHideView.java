package com.zing.zalo.p077ui.settings.subsettings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.BaseSettingView;
import com.zing.zalo.p077ui.settings.subsettings.SettingBlockAndHideView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.zviews.BlackListView;
import com.zing.zalo.p077ui.zviews.HiddenListView;
import com.zing.zalo.p077ui.zviews.StoryBlockedListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import la0.C22229g7;
import me0.AbstractC23136l9;
import p649xl.C29911lb;

/* loaded from: classes6.dex */
public final class SettingBlockAndHideView extends BaseSettingView {

    /* renamed from: T0 */
    public C29911lb f68216T0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m74475DM(SettingBlockAndHideView settingBlockAndHideView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingBlockAndHideView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingBlockAndHideView.m74480IM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m74476EM(SettingBlockAndHideView settingBlockAndHideView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingBlockAndHideView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingBlockAndHideView.m74480IM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m74477FM(SettingBlockAndHideView settingBlockAndHideView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingBlockAndHideView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingBlockAndHideView.m74480IM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m74478GM(SettingBlockAndHideView settingBlockAndHideView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingBlockAndHideView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingBlockAndHideView.m74480IM(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m74479HM(SettingBlockAndHideView settingBlockAndHideView, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingBlockAndHideView, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingBlockAndHideView.m74480IM(listItemSetting);
    }

    /* renamed from: IM */
    private final void m74480IM(ListItemSetting listItemSetting) {
        if (AbstractC19074t.m100204b(listItemSetting, m74484CM().f138599s)) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(BlockContactsView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74484CM().f138597q)) {
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(BlockCallView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74484CM().f138598r)) {
            Bundle bundle = new Bundle();
            bundle.putInt("int_extra_source_open", 2);
            C17487o0 m92662fJ3 = m92662fJ();
            if (m92662fJ3 != null) {
                m92662fJ3.m93069k2(BlackListView.class, bundle, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74484CM().f138600t)) {
            new Bundle().putInt("int_extra_source_open", 2);
            C17487o0 m92662fJ4 = m92662fJ();
            if (m92662fJ4 != null) {
                m92662fJ4.m93069k2(StoryBlockedListView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m74484CM().f138601u)) {
            new Bundle().putInt("int_extra_source_open", 2);
            C17487o0 m92662fJ5 = m92662fJ();
            if (m92662fJ5 != null) {
                m92662fJ5.m93069k2(HiddenListView.class, null, 1, true);
            }
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* renamed from: CM */
    public final C29911lb m74484CM() {
        C29911lb c29911lb = this.f68216T0;
        if (c29911lb != null) {
            return c29911lb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: JM */
    public final void m74485JM(C29911lb c29911lb) {
        AbstractC19074t.m100208f(c29911lb, "<set-?>");
        this.f68216T0 = c29911lb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_privacy_block_and_hide);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BlockView";
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 135;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m74484CM().f138599s;
        AbstractC19074t.m100207e(listItemSetting, "itemBlockMessage");
        ListItemSetting listItemSetting2 = m74484CM().f138597q;
        AbstractC19074t.m100207e(listItemSetting2, "itemBlockCall");
        ListItemSetting listItemSetting3 = m74484CM().f138598r;
        AbstractC19074t.m100207e(listItemSetting3, "itemBlockFeed");
        ListItemSetting listItemSetting4 = m74484CM().f138600t;
        AbstractC19074t.m100207e(listItemSetting4, "itemBlockStory");
        ListItemSetting listItemSetting5 = m74484CM().f138601u;
        AbstractC19074t.m100207e(listItemSetting5, "itemHideFeed");
        return new C22229g7[]{new C22229g7(listItemSetting, 68), new C22229g7(listItemSetting2, 141), new C22229g7(listItemSetting3, 117), new C22229g7(listItemSetting4, 119), new C22229g7(listItemSetting5, 118)};
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        final ListItemSetting listItemSetting = m74484CM().f138599s;
        listItemSetting.setIdTracking("Block");
        listItemSetting.setShowChevronRight(true);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: oa0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBlockAndHideView.m74475DM(SettingBlockAndHideView.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m74484CM().f138597q;
        listItemSetting2.setIdTracking("Block");
        listItemSetting2.setShowChevronRight(true);
        listItemSetting2.m90592m(false);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: oa0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBlockAndHideView.m74476EM(SettingBlockAndHideView.this, listItemSetting2, view);
            }
        });
        final ListItemSetting listItemSetting3 = m74484CM().f138598r;
        listItemSetting3.setIdTracking("Block");
        listItemSetting3.setShowChevronRight(true);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: oa0.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBlockAndHideView.m74477FM(SettingBlockAndHideView.this, listItemSetting3, view);
            }
        });
        final ListItemSetting listItemSetting4 = m74484CM().f138600t;
        listItemSetting4.setIdTracking("Block");
        listItemSetting4.setShowChevronRight(true);
        listItemSetting4.m90592m(false);
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: oa0.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBlockAndHideView.m74478GM(SettingBlockAndHideView.this, listItemSetting4, view);
            }
        });
        final ListItemSetting listItemSetting5 = m74484CM().f138601u;
        listItemSetting5.setIdTracking("Block");
        listItemSetting5.setShowChevronRight(true);
        listItemSetting5.m90592m(false);
        listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: oa0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingBlockAndHideView.m74479HM(SettingBlockAndHideView.this, listItemSetting5, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29911lb m148212b = C29911lb.m148212b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148212b, "inflate(...)");
        m74485JM(m148212b);
        View root = m74484CM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    public void mo73526uM() {
    }
}
