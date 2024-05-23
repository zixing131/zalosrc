package jo;

import ac.C0708i;
import am.AbstractC0924m0;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bo.C3000l0;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull;
import com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPrivacyQuickSetting;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import io.C20637a;
import io.C20638b;
import io.C20639c;
import io.C20640d;
import io.C20643g;
import is.AbstractC20809n;
import is.AbstractC20826v0;
import is.C20832y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l30.C22013a0;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p133ek.AbstractC18458a;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21937w;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p398oo.C24380u;
import p401or.C24417g;
import p455qo.C25429q;
import p553uo.C27347b;
import p604wb.C28905e;
import p688yo.AbstractC31037c;
import p716zh.C31980jc;
import p716zh.C32123ta;
import pm0.C24848g0;
import th.AbstractC26681b;
import ui0.C27280g;

/* renamed from: jo.b */
/* loaded from: classes4.dex */
public final class C21321b implements InterfaceC21320a {
    /* renamed from: l */
    private final boolean m110399l(String str, ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile != null && str != null) {
            try {
                if (TextUtils.equals(str, CoreUtility.f89233i) || !m110405r(itemAlbumMobile)) {
                    return false;
                }
                if (!AbstractC19074t.m100204b(itemAlbumMobile.f42593q, CoreUtility.f89233i)) {
                    if (!itemAlbumMobile.m40502K().m14389b(CoreUtility.f89233i)) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: a */
    public List mo110388a(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        boolean z11;
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPhotoViewfull, "data");
        ArrayList arrayList = new ArrayList();
        ItemAlbumMobile m45534d = bottomSheetMenuBundleDataPhotoViewfull.m45534d();
        boolean z12 = false;
        if (m45534d != null && TextUtils.equals(CoreUtility.f89233i, m45534d.f42593q)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m45534d != null && !TextUtils.isEmpty(m45534d.f42595r)) {
            z12 = true;
        }
        if (bottomSheetMenuBundleDataPhotoViewfull.m45547q() && z11) {
            C20639c.a aVar = C20639c.Companion;
            int i11 = AbstractC16803z.ic_bottom_sheet_menu_download;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_video_download);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList.add(C20639c.a.m107568b(aVar, 3, 28, i11, m118743r0, null, false, null, null, null, 496, null));
        }
        if (!z11 && z12) {
            C20639c.a aVar2 = C20639c.Companion;
            int i12 = AbstractC16803z.ic_bottom_sheet_menu_report;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reportabuse);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            arrayList.add(C20639c.a.m107568b(aVar2, 3, 29, i12, m118743r02, null, false, null, null, null, 496, null));
        }
        if (z11 && z12 && bottomSheetMenuBundleDataPhotoViewfull.m45535e() != 1) {
            C20639c.a aVar3 = C20639c.Companion;
            int i13 = AbstractC16803z.ic_bottom_sheet_menu_delete;
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_video_delete);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            arrayList.add(C20639c.a.m107568b(aVar3, 3, 30, i13, m118743r03, null, false, null, null, null, 496, null));
        }
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: b */
    public List mo110389b(C3000l0 c3000l0, String str, boolean z11) {
        C3020p0 c3020p0;
        int i11;
        String spannableString;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14325c0(str);
        } else {
            c3020p0 = null;
        }
        if (c3000l0 != null && !TextUtils.isEmpty(str) && str != null) {
            m110406s(c3000l0, str);
        }
        if (c3020p0 == null) {
            if (c3000l0 != null) {
                str2 = c3000l0.f11895q;
            }
            if (AbstractC19074t.m100204b(str2, "feed_content_id_sug_video_channel") && c3000l0.f11902t0 != null) {
                C20639c.a aVar = C20639c.Companion;
                int i17 = AbstractC16803z.ic_bottom_sheet_menu_hide;
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_menu_hide_content_x_days, "30");
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                arrayList.add(C20639c.a.m107568b(aVar, 3, 44, i17, m118746s0, null, false, null, null, null, 496, null));
            }
        }
        if (c3020p0 != null) {
            if (c3020p0.f12058q == 100) {
                C20639c.a aVar2 = C20639c.Companion;
                int i18 = AbstractC16803z.ic_bottom_sheet_menu_hide;
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_hide_banner);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                arrayList.add(C20639c.a.m107568b(aVar2, 3, 5, i18, m118743r0, null, false, null, null, null, 496, null));
            } else if (c3020p0.m14498b0() && C28905e.f133812l == 1) {
                C20639c.a aVar3 = C20639c.Companion;
                int i19 = AbstractC16803z.ic_bottom_sheet_menu_hide;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_this_ad);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                arrayList.add(C20639c.a.m107568b(aVar3, 3, 6, i19, m118743r02, null, false, null, null, null, 496, null));
                int i21 = AbstractC16803z.ic_bottom_sheet_menu_report;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_this_ad);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                arrayList.add(C20639c.a.m107568b(aVar3, 3, 7, i21, m118743r03, null, false, null, null, null, 496, null));
            } else if (!c3020p0.m14493X() && c3020p0.f12022B.f12279a <= 0) {
                if (c3020p0.m14494Y()) {
                    if (c3020p0.f12058q != 21) {
                        C20639c.a aVar4 = C20639c.Companion;
                        PrivacyInfo privacyInfo = c3020p0.f12042V;
                        AbstractC19074t.m100207e(privacyInfo, "privacyInfo");
                        int m110401n = m110401n(privacyInfo);
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_edit_privacy_title);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar4, 3, 3, m110401n, m118743r04, m110400m(c3020p0.f12042V), false, null, null, null, 480, null));
                    }
                    if (c3020p0.m14485P() && AbstractC23309i.m122305q2()) {
                        C20639c.a aVar5 = C20639c.Companion;
                        int i22 = AbstractC16803z.ic_bottom_sheet_menu_edit;
                        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed);
                        AbstractC19074t.m100207e(m118743r05, "getString(...)");
                        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed_desc);
                        AbstractC19074t.m100207e(m118743r06, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar5, 3, 11, i22, m118743r05, m118743r06, false, null, null, null, 480, null));
                    }
                    C20639c.a aVar6 = C20639c.Companion;
                    int i23 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                    String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_title);
                    AbstractC19074t.m100207e(m118743r07, "getString(...)");
                    String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_des);
                    AbstractC19074t.m100207e(m118743r08, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar6, 3, 8, i23, m118743r07, m118743r08, false, null, null, null, 480, null));
                    if (c3020p0.m14482K()) {
                        int i24 = AbstractC16803z.ic_bottom_sheet_menu_tag;
                        String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_remove_tag_feed);
                        AbstractC19074t.m100207e(m118743r09, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar6, 3, 10, i24, m118743r09, null, false, null, null, null, 496, null));
                    }
                } else {
                    String str3 = AbstractC18458a.f93019a;
                    C3047v0 c3047v0 = c3020p0.f12022B;
                    String m114542i = AbstractC21935u.m114542i(c3047v0.f12280b, c3047v0.f12282d);
                    C20639c.a aVar7 = C20639c.Companion;
                    int i25 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                    String m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_friend_feed_title);
                    AbstractC19074t.m100207e(m118743r010, "getString(...)");
                    String m118743r011 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_friend_feed_des);
                    AbstractC19074t.m100207e(m118743r011, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar7, 3, 12, i25, m118743r010, m118743r011, false, null, null, null, 480, null));
                    if (C24380u.f117739a.m127513f() && c3000l0.f11893p != 1) {
                        boolean m100204b = AbstractC19074t.m100204b(new C27347b().m101509a(AbstractC31037c.m150865a(c3000l0.f11896q0)), Boolean.TRUE);
                        if (c3000l0.f11896q0 == 0) {
                            i15 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_other_title;
                        } else {
                            i15 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_main_title;
                        }
                        String m118746s02 = AbstractC23136l9.m118746s0(i15, m114542i);
                        AbstractC19074t.m100207e(m118746s02, "getString(...)");
                        C20832y0 c20832y0 = C20832y0.f102396a;
                        C20832y0.a aVar8 = new C20832y0.a(m118746s02, m110402o(), null, 4, null);
                        AbstractC19074t.m100205c(m114542i);
                        String m108877e = c20832y0.m108877e(aVar8, m114542i, m110403p(m100204b), 1, C20832y0.b.f102402q);
                        if (c3000l0.f11896q0 == 0) {
                            i16 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_other_desc;
                        } else {
                            i16 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_main_desc;
                        }
                        String m118746s03 = AbstractC23136l9.m118746s0(i16, m114542i);
                        AbstractC19074t.m100207e(m118746s03, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar7, 3, 42, 0, m108877e, m118746s03, m100204b, C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_posts_move_line_24, AbstractC2807a.icon_02), null, null, 384, null));
                    }
                    String m118746s04 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hide_user_feed_confirm_desc, m114542i);
                    AbstractC19074t.m100207e(m118746s04, "getString(...)");
                    String m118743r012 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_hide_friend_feed_des);
                    AbstractC19074t.m100207e(m118743r012, "getString(...)");
                    MainApplication.C6895a c6895a = MainApplication.Companion;
                    arrayList.add(C20639c.a.m107568b(aVar7, 3, 13, 0, m118746s04, m118743r012, false, C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02), null, null, 416, null));
                    if (AbstractC0924m0.m4045n9()) {
                        boolean m114169j = C21912a.m114159g().m114169j(c3020p0.f12022B.f12280b);
                        if (!AbstractC19074t.m100204b(str3, "en") && !AbstractC19074t.m100204b(str3, "my")) {
                            if (m114169j) {
                                i13 = AbstractC8020f0.str_feed_item_option_item_unblocked_prefix_title;
                            } else {
                                i13 = AbstractC8020f0.str_feed_item_option_item_blocked_prefix_title_v2;
                            }
                            String m118743r013 = AbstractC23136l9.m118743r0(i13);
                            if (m114169j) {
                                i14 = AbstractC8020f0.str_feed_item_option_item_unblocked_suffix_title;
                            } else {
                                i14 = AbstractC8020f0.str_feed_item_option_item_blocked_suffix_title;
                            }
                            spannableString = AbstractC20809n.m108564G(m118743r013, m114542i, AbstractC23136l9.m118743r0(i14), m110404q(), false, false, 1, 17).toString();
                            AbstractC19074t.m100207e(spannableString, "toString(...)");
                        } else {
                            if (m114169j) {
                                i11 = AbstractC8020f0.str_feed_item_option_item_unblocked_prefix_title;
                            } else {
                                i11 = AbstractC8020f0.str_feed_item_option_item_blocked_prefix_title_v2;
                            }
                            spannableString = AbstractC20809n.m108562E(AbstractC23136l9.m118743r0(i11), m114542i, m110404q(), false, 1, 17).toString();
                            AbstractC19074t.m100207e(spannableString, "toString(...)");
                        }
                        String str4 = spannableString;
                        if (m114169j) {
                            i12 = AbstractC8020f0.str_feed_item_option_item_unblocked_des;
                        } else {
                            i12 = AbstractC8020f0.str_feed_item_option_item_blocked_des;
                        }
                        String m118743r014 = AbstractC23136l9.m118743r0(i12);
                        AbstractC19074t.m100207e(m118743r014, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar7, 3, 34, 0, str4, m118743r014, false, C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_posts_block_line_24, AbstractC2807a.icon_02), null, null, 416, null));
                    }
                    int i26 = AbstractC16803z.ic_bottom_sheet_menu_report;
                    String m118743r015 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_report_title);
                    AbstractC19074t.m100207e(m118743r015, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar7, 3, 9, i26, m118743r015, null, false, null, null, null, 496, null));
                    if (c3020p0.m14482K() && c3020p0.m14502d0()) {
                        int i27 = AbstractC16803z.ic_bottom_sheet_menu_tag;
                        String m118743r016 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_remove_tag_feed);
                        AbstractC19074t.m100207e(m118743r016, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar7, 3, 10, i27, m118743r016, null, false, null, null, null, 496, null));
                    }
                    if (C18644n.m98531l().m98558u(c3020p0.f12022B.f12280b)) {
                        int i28 = AbstractC16803z.ic_menu_remove_friend;
                        String m118743r017 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_option_remove_friend);
                        AbstractC19074t.m100207e(m118743r017, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar7, 3, 41, i28, m118743r017, null, false, null, null, null, 496, null));
                    }
                }
            }
            if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
                arrayList.add(C20639c.a.m107568b(C20639c.Companion, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
            }
        }
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: c */
    public List mo110390c(C20638b c20638b) {
        boolean z11;
        int i11;
        String str;
        int i12;
        AbstractC19074t.m100208f(c20638b, "dataStoryViewFull");
        ArrayList arrayList = new ArrayList();
        C31980jc m107555a = c20638b.m107555a();
        if (m107555a != null) {
            boolean m100204b = AbstractC19074t.m100204b(m107555a.f147023p, CoreUtility.f89233i);
            if (m107555a.f147029v == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            String str2 = "";
            String str3 = null;
            if (m100204b) {
                C32123ta m153825r = m107555a.m153825r();
                if (m153825r != null && (i11 = m153825r.f148128c) != 1 && i11 != 5) {
                    if (C24417g.f117907a.m127702d() && c20638b.m107556b() != 5 && m153825r.f148128c != 2) {
                        PrivacyInfo privacyInfo = m153825r.f148149o;
                        if (privacyInfo != null) {
                            str3 = privacyInfo.m45150u();
                        }
                        if (str3 == null) {
                            str = "";
                        } else {
                            str = str3;
                        }
                        PrivacyInfo privacyInfo2 = m153825r.f148149o;
                        if (privacyInfo2 != null) {
                            i12 = privacyInfo2.m45146n();
                        } else {
                            i12 = AbstractC16803z.ic_story_privacy_black_line_all;
                        }
                        int i13 = i12;
                        C20639c.a aVar = C20639c.Companion;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_story_privacy_title);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar, 3, 40, i13, m118743r0, str, false, null, null, null, 480, null));
                    }
                    if (c20638b.m107556b() != 5 && m153825r.f148128c != 2) {
                        C20639c.a aVar2 = C20639c.Companion;
                        int i14 = AbstractC16803z.ic_bottom_sheet_story_add_archive;
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_story_archive_title);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_story_archive_desc);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar2, 3, 35, i14, m118743r02, m118743r03, false, null, null, null, 480, null));
                    }
                    if (!m153825r.m155070J()) {
                        C20639c.a aVar3 = C20639c.Companion;
                        int i15 = AbstractC16803z.ic_bottom_sheet_story_download;
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_story_download_tittle);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar3, 3, 36, i15, m118743r04, null, false, null, null, null, 496, null));
                    }
                    if (c20638b.m107556b() != 5 && m153825r.f148140i == 1) {
                        C20639c.a aVar4 = C20639c.Companion;
                        int i16 = AbstractC16803z.ic_bottom_sheet_story_post_feed;
                        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_post_on_timeline);
                        AbstractC19074t.m100207e(m118743r05, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar4, 3, 37, i16, m118743r05, null, false, null, null, null, 496, null));
                    }
                    if (!m153825r.m155068H()) {
                        C20639c.a aVar5 = C20639c.Companion;
                        int i17 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_delete_this_story);
                        AbstractC19074t.m100207e(m118743r06, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar5, 3, 38, i17, m118743r06, null, false, null, null, null, 496, null));
                    }
                    if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
                        arrayList.add(C20639c.a.m107568b(C20639c.Companion, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
                    }
                }
            } else if (z11) {
                C32123ta m153825r2 = m107555a.m153825r();
                C20639c.a aVar6 = C20639c.Companion;
                int i18 = AbstractC16803z.ic_bottom_sheet_menu_hide;
                String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_this_ad);
                AbstractC19074t.m100207e(m118743r07, "getString(...)");
                arrayList.add(C20639c.a.m107568b(aVar6, 3, 45, i18, m118743r07, null, false, null, null, null, 496, null));
                int i19 = AbstractC16803z.ic_bottom_sheet_menu_report;
                String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_this_ad);
                AbstractC19074t.m100207e(m118743r08, "getString(...)");
                C0708i c0708i = new C0708i();
                if (m153825r2 != null) {
                    str3 = m153825r2.f148121X;
                }
                if (str3 != null) {
                    AbstractC19074t.m100205c(str3);
                    str2 = str3;
                }
                c0708i.m1075f("adId", str2);
                C24848g0 c24848g0 = C24848g0.f119245a;
                arrayList.add(C20639c.a.m107568b(aVar6, 3, 46, i19, m118743r08, null, false, null, "report_story_ad", c0708i, 112, null));
            } else {
                C20639c.a aVar7 = C20639c.Companion;
                int i21 = AbstractC16803z.ic_bottom_sheet_menu_report;
                String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_report_title);
                AbstractC19074t.m100207e(m118743r09, "getString(...)");
                arrayList.add(C20639c.a.m107568b(aVar7, 3, 39, i21, m118743r09, null, false, null, null, null, 496, null));
                if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
                    arrayList.add(C20639c.a.m107568b(aVar7, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
                }
            }
        }
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: d */
    public List mo110391d(C3020p0 c3020p0, boolean z11, boolean z12, boolean z13, int i11) {
        String m118743r0;
        boolean m127128x;
        ArrayList arrayList = new ArrayList();
        if (c3020p0 != null) {
            if (!c3020p0.f12027G && c3020p0.f12022B.f12279a <= 0) {
                if (c3020p0.m14498b0() && C28905e.f133812l == 1) {
                    C20639c.a aVar = C20639c.Companion;
                    int i12 = AbstractC16803z.ic_bottom_sheet_menu_hide;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_feed_ad);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar, 3, 6, i12, m118743r02, null, false, null, null, null, 496, null));
                    int i13 = AbstractC16803z.ic_bottom_sheet_menu_hide;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_all_feed_ads);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    Object[] objArr = new Object[1];
                    C3047v0 c3047v0 = c3020p0.f12022B;
                    objArr[0] = c3047v0 != null ? c3047v0.f12282d : "";
                    String format = String.format(m118743r03, Arrays.copyOf(objArr, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    arrayList.add(C20639c.a.m107568b(aVar, 3, 15, i13, format, null, false, null, null, null, 496, null));
                } else if (c3020p0.m14494Y()) {
                    if (i11 == 12 || i11 == 13) {
                        C20639c.a aVar2 = C20639c.Companion;
                        int i14 = AbstractC16803z.ic_bottom_sheet_menu_share;
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_share_memory);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar2, 3, 17, i14, m118743r04, null, false, null, null, null, 496, null));
                        if (AbstractC26681b.f126377v) {
                            int i15 = AbstractC16803z.ic_bottom_sheet_menu_hide;
                            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_hide_memory_menu);
                            AbstractC19074t.m100207e(m118743r05, "getString(...)");
                            arrayList.add(C20639c.a.m107568b(aVar2, 3, 18, i15, m118743r05, null, false, null, null, null, 496, null));
                        }
                    }
                    PrivacyInfo privacyInfo = c3020p0.f12042V;
                    if (privacyInfo != null && !z12 && c3020p0.f12058q != 21) {
                        C20639c.a aVar3 = C20639c.Companion;
                        AbstractC19074t.m100207e(privacyInfo, "privacyInfo");
                        int m110401n = m110401n(privacyInfo);
                        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_edit_privacy_title);
                        AbstractC19074t.m100207e(m118743r06, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar3, 3, 3, m110401n, m118743r06, m110400m(c3020p0.f12042V), false, null, null, null, 480, null));
                    }
                    if (c3020p0.m14485P() && z13) {
                        C20639c.a aVar4 = C20639c.Companion;
                        int i16 = AbstractC16803z.ic_bottom_sheet_menu_edit;
                        String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed);
                        AbstractC19074t.m100207e(m118743r07, "getString(...)");
                        String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed_desc);
                        AbstractC19074t.m100207e(m118743r08, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar4, 3, 11, i16, m118743r07, m118743r08, false, null, null, null, 480, null));
                    }
                    C20639c.a aVar5 = C20639c.Companion;
                    int i17 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                    String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_title);
                    AbstractC19074t.m100207e(m118743r09, "getString(...)");
                    String m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_des);
                    AbstractC19074t.m100207e(m118743r010, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar5, 3, 8, i17, m118743r09, m118743r010, false, null, null, null, 480, null));
                    boolean z14 = c3020p0.f12065x;
                    int i18 = z14 ? AbstractC16803z.ic_bottom_sheet_menu_off_notification : AbstractC16803z.ic_bottom_sheet_menu_on_notification;
                    String m118743r011 = AbstractC23136l9.m118743r0(z14 ? AbstractC8020f0.str_bottom_sheet_menu_off_notification : AbstractC8020f0.str_bottom_sheet_menu_on_notification);
                    AbstractC19074t.m100205c(m118743r011);
                    arrayList.add(C20639c.a.m107568b(aVar5, 3, 16, i18, m118743r011, null, false, null, null, null, 496, null));
                    C3003l3 c3003l3 = c3020p0.f12059r;
                    if (c3003l3 != null && c3003l3.f11956a > 0 && !z12) {
                        int i19 = AbstractC16803z.ic_bottom_sheet_menu_tag;
                        String m118743r012 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_remove_tag_feed);
                        AbstractC19074t.m100207e(m118743r012, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar5, 3, 10, i19, m118743r012, null, false, null, null, null, 496, null));
                    }
                } else {
                    if (z11) {
                        C20639c.a aVar6 = C20639c.Companion;
                        int i21 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                        String m118743r013 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_friend_feed_title);
                        AbstractC19074t.m100207e(m118743r013, "getString(...)");
                        String m118743r014 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_friend_feed_des);
                        AbstractC19074t.m100207e(m118743r014, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar6, 3, 8, i21, m118743r013, m118743r014, false, null, null, null, 480, null));
                        C3047v0 c3047v02 = c3020p0.f12022B;
                        if (c3047v02 != null) {
                            String str = c3047v02.f12282d;
                            AbstractC19074t.m100207e(str, "displayName");
                            m127128x = AbstractC24341v.m127128x(str);
                            if (!m127128x) {
                                m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hide_user_feed_confirm_desc, c3020p0.f12022B.f12282d);
                                String str2 = m118743r0;
                                AbstractC19074t.m100205c(str2);
                                String m118743r015 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_hide_friend_feed_des);
                                AbstractC19074t.m100207e(m118743r015, "getString(...)");
                                arrayList.add(C20639c.a.m107568b(aVar6, 3, 13, 0, str2, m118743r015, false, C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02), null, null, 416, null));
                            }
                        }
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_hide_activity_title);
                        String str22 = m118743r0;
                        AbstractC19074t.m100205c(str22);
                        String m118743r0152 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_hide_friend_feed_des);
                        AbstractC19074t.m100207e(m118743r0152, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar6, 3, 13, 0, str22, m118743r0152, false, C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02), null, null, 416, null));
                    }
                    C20639c.a aVar7 = C20639c.Companion;
                    boolean z15 = c3020p0.f12065x;
                    int i22 = z15 ? AbstractC16803z.ic_bottom_sheet_menu_off_notification : AbstractC16803z.ic_bottom_sheet_menu_on_notification;
                    String m118743r016 = AbstractC23136l9.m118743r0(z15 ? AbstractC8020f0.str_bottom_sheet_menu_off_notification : AbstractC8020f0.str_bottom_sheet_menu_on_notification);
                    AbstractC19074t.m100205c(m118743r016);
                    arrayList.add(C20639c.a.m107568b(aVar7, 3, 16, i22, m118743r016, null, false, null, null, null, 496, null));
                    int i23 = AbstractC16803z.ic_bottom_sheet_menu_report;
                    String m118743r017 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_report_title);
                    AbstractC19074t.m100207e(m118743r017, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar7, 3, 9, i23, m118743r017, null, false, null, null, null, 496, null));
                    C3003l3 c3003l32 = c3020p0.f12059r;
                    if (c3003l32 != null && c3003l32.f11956a > 0 && !z12 && c3003l32.m14389b(CoreUtility.f89233i)) {
                        int i24 = AbstractC16803z.ic_bottom_sheet_menu_tag;
                        String m118743r018 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_remove_tag_feed);
                        AbstractC19074t.m100207e(m118743r018, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar7, 3, 10, i24, m118743r018, null, false, null, null, null, 496, null));
                    }
                    if (!z12 && C18644n.m98531l().m98558u(c3020p0.f12022B.f12280b)) {
                        int i25 = AbstractC16803z.ic_menu_remove_friend;
                        String m118743r019 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_option_remove_friend);
                        AbstractC19074t.m100207e(m118743r019, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar7, 3, 41, i25, m118743r019, null, false, null, null, null, 496, null));
                    }
                }
            }
            if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
                arrayList.add(C20639c.a.m107568b(C20639c.Companion, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
            }
        }
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: e */
    public List mo110392e(C3020p0 c3020p0) {
        ArrayList arrayList = new ArrayList();
        if (c3020p0 != null) {
            if (!c3020p0.f12027G && !c3020p0.m14518m0()) {
                if (c3020p0.m14494Y()) {
                    if (c3020p0.m14485P() && AbstractC23309i.m122305q2()) {
                        C20639c.a aVar = C20639c.Companion;
                        int i11 = AbstractC16803z.ic_bottom_sheet_menu_edit;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed_desc);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar, 3, 11, i11, m118743r0, m118743r02, false, null, null, null, 480, null));
                    }
                    C20639c.a aVar2 = C20639c.Companion;
                    int i12 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_title);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_des);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar2, 3, 8, i12, m118743r03, m118743r04, false, null, null, null, 480, null));
                } else {
                    C20639c.a aVar3 = C20639c.Companion;
                    int i13 = AbstractC16803z.ic_bottom_sheet_menu_report;
                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_report_title);
                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar3, 3, 9, i13, m118743r05, null, false, null, null, null, 496, null));
                }
            }
            if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
                arrayList.add(C20639c.a.m107568b(C20639c.Companion, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
            }
        }
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: f */
    public List mo110393f() {
        ArrayList arrayList = new ArrayList();
        C20639c.a aVar = C20639c.Companion;
        int i11 = AbstractC16803z.ic_bottom_sheet_menu_hide;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_profile_hide_memory_menu);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(C20639c.a.m107568b(aVar, 3, 14, i11, m118743r0, null, false, null, null, null, 496, null));
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: g */
    public List mo110394g(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        int i11;
        int i12;
        int i13;
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPhotoViewfull, "data");
        ArrayList arrayList = new ArrayList();
        ItemAlbumMobile m45534d = bottomSheetMenuBundleDataPhotoViewfull.m45534d();
        if (m110399l(bottomSheetMenuBundleDataPhotoViewfull.m45536f(), bottomSheetMenuBundleDataPhotoViewfull.m45534d())) {
            C20639c.a aVar = C20639c.Companion;
            int i14 = AbstractC16803z.ic_bottom_sheet_menu_tag;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_remove_tag_feed);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList.add(C20639c.a.m107568b(aVar, 3, 31, i14, m118743r0, null, false, null, null, null, 496, null));
        }
        if (!TextUtils.equals(bottomSheetMenuBundleDataPhotoViewfull.m45536f(), CoreUtility.f89233i)) {
            C20639c.a aVar2 = C20639c.Companion;
            int i15 = AbstractC16803z.ic_bottom_sheet_menu_report;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reportabuse);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            arrayList.add(C20639c.a.m107568b(aVar2, 3, 22, i15, m118743r02, null, false, null, null, null, 496, null));
        }
        if (m45534d != null && (((i11 = m45534d.f42590o0) == 2 || i11 == 17) && bottomSheetMenuBundleDataPhotoViewfull.m45545o())) {
            C20639c.a aVar3 = C20639c.Companion;
            boolean z11 = m45534d.f42568S;
            if (z11) {
                i12 = AbstractC16803z.ic_bottom_sheet_menu_off_notification;
            } else {
                i12 = AbstractC16803z.ic_bottom_sheet_menu_on_notification;
            }
            if (z11) {
                i13 = AbstractC8020f0.str_bottom_sheet_menu_off_notification;
            } else {
                i13 = AbstractC8020f0.str_bottom_sheet_menu_on_notification;
            }
            String m118743r03 = AbstractC23136l9.m118743r0(i13);
            AbstractC19074t.m100205c(m118743r03);
            arrayList.add(C20639c.a.m107568b(aVar3, 3, 33, i12, m118743r03, null, false, null, null, null, 496, null));
        }
        if (m45534d != null && bottomSheetMenuBundleDataPhotoViewfull.m45546p() && !TextUtils.equals(bottomSheetMenuBundleDataPhotoViewfull.m45536f(), CoreUtility.f89233i) && C18644n.m98531l().m98558u(bottomSheetMenuBundleDataPhotoViewfull.m45536f())) {
            C20639c.a aVar4 = C20639c.Companion;
            int i16 = AbstractC16803z.ic_menu_remove_friend;
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_option_remove_friend);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            arrayList.add(C20639c.a.m107568b(aVar4, 3, 41, i16, m118743r04, null, false, null, null, null, 496, null));
        }
        if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
            arrayList.add(C20639c.a.m107568b(C20639c.Companion, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
        }
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: h */
    public List mo110395h(C20637a c20637a) {
        C3020p0 c3020p0;
        C3047v0 c3047v0;
        int i11;
        int i12;
        AbstractC19074t.m100208f(c20637a, "data");
        ArrayList arrayList = new ArrayList();
        C3000l0 m107540b = c20637a.m107540b();
        if (m107540b != null) {
            c3020p0 = m107540b.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (m107540b != null && c3020p0 != null) {
            C20639c.a aVar = C20639c.Companion;
            int i13 = AbstractC16803z.ic_bottom_sheet_menu_delete;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.menu_group_feed_delete);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList.add(C20639c.a.m107568b(aVar, 3, 8, i13, m118743r0, null, false, null, null, null, 496, null));
            if (m107540b.f11893p == 2 && (c3047v0 = c3020p0.f12022B) != null && !c3047v0.f12280b.equals(CoreUtility.f89233i)) {
                C3047v0 c3047v02 = c3020p0.f12022B;
                if (c3047v02.f12279a <= 0) {
                    String m114542i = AbstractC21935u.m114542i(c3047v02.f12280b, c3047v02.f12282d);
                    if (C24380u.f117739a.m127513f()) {
                        boolean m100204b = AbstractC19074t.m100204b(new C27347b().m101509a(AbstractC31037c.m150865a(m107540b.f11896q0)), Boolean.TRUE);
                        if (m107540b.f11896q0 == 0) {
                            i11 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_other_title;
                        } else {
                            i11 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_main_title;
                        }
                        String m118746s0 = AbstractC23136l9.m118746s0(i11, m114542i);
                        AbstractC19074t.m100207e(m118746s0, "getString(...)");
                        C20832y0 c20832y0 = C20832y0.f102396a;
                        C20832y0.a aVar2 = new C20832y0.a(m118746s0, m110402o(), null, 4, null);
                        AbstractC19074t.m100205c(m114542i);
                        String m108877e = c20832y0.m108877e(aVar2, m114542i, m110403p(m100204b), 1, C20832y0.b.f102402q);
                        if (m107540b.f11896q0 == 0) {
                            i12 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_other_desc;
                        } else {
                            i12 = AbstractC8020f0.str_bottom_sheet_menu_move_to_tab_main_desc;
                        }
                        String m118746s02 = AbstractC23136l9.m118746s0(i12, m114542i);
                        AbstractC19074t.m100207e(m118746s02, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar, 3, 42, 0, m108877e, m118746s02, m100204b, C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_posts_move_line_24, AbstractC2807a.icon_02), null, null, 384, null));
                    }
                    int i14 = AbstractC23322a.zds_ic_posts_hide_line_24;
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_hide_activity_title);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_hide_friend_feed_des);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar, 3, 13, i14, m118743r02, m118743r03, false, C27280g.m139660c(MainApplication.Companion.m35500c(), AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02), null, null, 416, null));
                    if (C18644n.m98531l().m98558u(c3020p0.f12022B.f12280b)) {
                        int i15 = AbstractC16803z.ic_menu_remove_friend;
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_option_remove_friend);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar, 3, 41, i15, m118743r04, null, false, null, null, null, 496, null));
                    }
                }
            }
            if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
                arrayList.add(C20639c.a.m107568b(aVar, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
            }
        }
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: i */
    public List mo110396i(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        int i11;
        int i12;
        boolean m127127w;
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPhotoViewfull, "data");
        ArrayList arrayList = new ArrayList();
        int m45531a = bottomSheetMenuBundleDataPhotoViewfull.m45531a();
        boolean z26 = false;
        if (m45531a != 0) {
            if (m45531a != 1) {
                if (m45531a != 2) {
                    if (m45531a == 3) {
                        C20639c.a aVar = C20639c.Companion;
                        int i13 = AbstractC16803z.ic_bottom_sheet_menu_post_feed;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar, 3, 25, i13, m118743r0, null, false, null, null, null, 496, null));
                        if (C22013a0.m114928g()) {
                            int i14 = AbstractC16803z.ic_bottom_sheet_menu_post_feed;
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_photo_post_story);
                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                            arrayList.add(C20639c.a.m107568b(aVar, 3, 26, i14, m118743r02, null, false, null, null, null, 496, null));
                        }
                        int i15 = AbstractC16803z.ic_bottom_sheet_menu_download;
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_photo_download);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar, 3, 23, i15, m118743r03, null, false, null, null, null, 496, null));
                        if (bottomSheetMenuBundleDataPhotoViewfull.m45543m() || TextUtils.equals(bottomSheetMenuBundleDataPhotoViewfull.m45533c(), CoreUtility.f89233i)) {
                            int i16 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_menu_photo_delete);
                            AbstractC19074t.m100207e(m118743r04, "getString(...)");
                            arrayList.add(C20639c.a.m107568b(aVar, 3, 27, i16, m118743r04, null, false, null, null, null, 496, null));
                        }
                        if (bottomSheetMenuBundleDataPhotoViewfull.m45536f() != null) {
                            m127127w = AbstractC24341v.m127127w(bottomSheetMenuBundleDataPhotoViewfull.m45536f(), CoreUtility.f89233i, false, 2, null);
                            if (!m127127w) {
                                int i17 = AbstractC16803z.ic_bottom_sheet_menu_report;
                                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reportabuse);
                                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                                arrayList.add(C20639c.a.m107568b(aVar, 3, 22, i17, m118743r05, null, false, null, null, null, 496, null));
                            }
                        }
                    }
                } else {
                    C20639c.a aVar2 = C20639c.Companion;
                    int i18 = AbstractC16803z.ic_bottom_sheet_menu_share;
                    String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.share);
                    AbstractC19074t.m100207e(m118743r06, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar2, 3, 24, i18, m118743r06, null, false, null, null, null, 496, null));
                    int i19 = AbstractC16803z.ic_bottom_sheet_menu_post_feed;
                    String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine);
                    AbstractC19074t.m100207e(m118743r07, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar2, 3, 25, i19, m118743r07, null, false, null, null, null, 496, null));
                    if (C22013a0.m114928g()) {
                        int i21 = AbstractC16803z.ic_bottom_sheet_menu_post_feed;
                        String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_share_photo_post_story);
                        AbstractC19074t.m100207e(m118743r08, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar2, 3, 26, i21, m118743r08, null, false, null, null, null, 496, null));
                    }
                    int i22 = AbstractC16803z.ic_bottom_sheet_menu_download;
                    String m118743r09 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_photo_download);
                    AbstractC19074t.m100207e(m118743r09, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar2, 3, 23, i22, m118743r09, null, false, null, null, null, 496, null));
                }
            } else {
                C20639c.a aVar3 = C20639c.Companion;
                int i23 = AbstractC16803z.ic_bottom_sheet_menu_report;
                String m118743r010 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reportabuse);
                AbstractC19074t.m100207e(m118743r010, "getString(...)");
                arrayList.add(C20639c.a.m107568b(aVar3, 3, 22, i23, m118743r010, null, false, null, null, null, 496, null));
            }
        } else {
            ItemAlbumMobile m45534d = bottomSheetMenuBundleDataPhotoViewfull.m45534d();
            if (m45534d != null) {
                String str = m45534d.f42593q;
                if (str != null && str.equals(CoreUtility.f89233i)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bottomSheetMenuBundleDataPhotoViewfull.m45540j() && z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean m45544n = bottomSheetMenuBundleDataPhotoViewfull.m45544n();
                if (bottomSheetMenuBundleDataPhotoViewfull.m45540j() && !z11 && !m45544n) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (bottomSheetMenuBundleDataPhotoViewfull.m45541k() && z11) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (bottomSheetMenuBundleDataPhotoViewfull.m45541k() && !z11 && !m45544n) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (m45534d.f42591p == 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                C3020p0 c3020p0 = m45534d.f42594q0;
                if (c3020p0 != null && AbstractC20826v0.m108789V(c3020p0) != null) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (z16 && !z11) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z16 && z17) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (bottomSheetMenuBundleDataPhotoViewfull.m45538h() && bottomSheetMenuBundleDataPhotoViewfull.m45532b() == 0) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (bottomSheetMenuBundleDataPhotoViewfull.m45539i() && bottomSheetMenuBundleDataPhotoViewfull.m45532b() == 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                if (z11 && !z12 && !z14 && !z21 && !z22) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                if (!z13 && !z15 && !z18 && !z19) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (!z16 && (bottomSheetMenuBundleDataPhotoViewfull.m45542l() || z12 || bottomSheetMenuBundleDataPhotoViewfull.m45537g() || z14)) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (!z16 && (bottomSheetMenuBundleDataPhotoViewfull.m45542l() || z12 || bottomSheetMenuBundleDataPhotoViewfull.m45537g() || z14)) {
                    z26 = true;
                }
                boolean z27 = !z11;
                if (z26) {
                    C20639c.a aVar4 = C20639c.Companion;
                    int i24 = AbstractC16803z.ic_bottom_sheet_menu_share;
                    String m118743r011 = AbstractC23136l9.m118743r0(AbstractC8020f0.share);
                    AbstractC19074t.m100207e(m118743r011, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar4, 3, 24, i24, m118743r011, null, false, null, null, null, 496, null));
                }
                if (z25) {
                    C20639c.a aVar5 = C20639c.Companion;
                    int i25 = AbstractC16803z.ic_bottom_sheet_menu_post_feed;
                    String m118743r012 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_optionM_shareVipAccOnTimeLine);
                    AbstractC19074t.m100207e(m118743r012, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar5, 3, 25, i25, m118743r012, null, false, null, null, null, 496, null));
                }
                if (z24) {
                    C20639c.a aVar6 = C20639c.Companion;
                    int i26 = AbstractC16803z.ic_bottom_sheet_menu_download;
                    if (z16) {
                        i12 = AbstractC8020f0.str_bottom_sheet_menu_video_download;
                    } else {
                        i12 = AbstractC8020f0.str_bottom_sheet_menu_photo_download;
                    }
                    String m118743r013 = AbstractC23136l9.m118743r0(i12);
                    AbstractC19074t.m100205c(m118743r013);
                    arrayList.add(C20639c.a.m107568b(aVar6, 3, 23, i26, m118743r013, null, false, null, null, null, 496, null));
                }
                if (z23) {
                    C20639c.a aVar7 = C20639c.Companion;
                    int i27 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                    if (z16) {
                        i11 = AbstractC8020f0.str_menu_video_delete;
                    } else {
                        i11 = AbstractC8020f0.str_menu_photo_delete;
                    }
                    String m118743r014 = AbstractC23136l9.m118743r0(i11);
                    AbstractC19074t.m100205c(m118743r014);
                    arrayList.add(C20639c.a.m107568b(aVar7, 3, 27, i27, m118743r014, null, false, null, null, null, 496, null));
                }
                if (z27) {
                    C20639c.a aVar8 = C20639c.Companion;
                    int i28 = AbstractC16803z.ic_bottom_sheet_menu_report;
                    String m118743r015 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_reportabuse);
                    AbstractC19074t.m100207e(m118743r015, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar8, 3, 22, i28, m118743r015, null, false, null, null, null, 496, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0078  */
    @Override // jo.InterfaceC21320a
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List mo110397j(BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting) {
        boolean z11;
        boolean z12;
        String str;
        AbstractC19074t.m100208f(bottomSheetMenuBundleDataPrivacyQuickSetting, "data");
        ArrayList arrayList = new ArrayList();
        C20643g.a aVar = C20643g.Companion;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_quick_setting_title);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(aVar.m107585a(1, 1, m118743r0));
        Boolean m45557b = bottomSheetMenuBundleDataPrivacyQuickSetting.m45557b();
        Boolean bool = Boolean.TRUE;
        String str2 = null;
        if (!AbstractC19074t.m100204b(m45557b, bool)) {
            C21912a m114159g = C21912a.m114159g();
            ContactProfile m45556a = bottomSheetMenuBundleDataPrivacyQuickSetting.m45556a();
            if (m45556a != null) {
                str = m45556a.f42434r;
            } else {
                str = null;
            }
            if (!m114159g.m114169j(str)) {
                z11 = false;
                C20640d.a aVar2 = C20640d.Companion;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_quick_setting_ban);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                MainApplication.C6895a c6895a = MainApplication.Companion;
                arrayList.add(aVar2.m107577a(4, 34, 0, m118743r02, "", z11, C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_posts_block_line_24, AbstractC2807a.icon_02)));
                if (!AbstractC19074t.m100204b(bottomSheetMenuBundleDataPrivacyQuickSetting.m45558c(), bool)) {
                    C21937w c21937w = C21937w.f108027a;
                    ContactProfile m45556a2 = bottomSheetMenuBundleDataPrivacyQuickSetting.m45556a();
                    if (m45556a2 != null) {
                        str2 = m45556a2.f42434r;
                    }
                    if (!c21937w.m114574m(str2)) {
                        z12 = false;
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_quick_setting_hide);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        arrayList.add(aVar2.m107577a(4, 13, 0, m118743r03, "", z12, C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02)));
                        return arrayList;
                    }
                }
                z12 = true;
                String m118743r032 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_quick_setting_hide);
                AbstractC19074t.m100207e(m118743r032, "getString(...)");
                arrayList.add(aVar2.m107577a(4, 13, 0, m118743r032, "", z12, C27280g.m139660c(c6895a.m35500c(), AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02)));
                return arrayList;
            }
        }
        z11 = true;
        C20640d.a aVar22 = C20640d.Companion;
        String m118743r022 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_quick_setting_ban);
        AbstractC19074t.m100207e(m118743r022, "getString(...)");
        MainApplication.C6895a c6895a2 = MainApplication.Companion;
        arrayList.add(aVar22.m107577a(4, 34, 0, m118743r022, "", z11, C27280g.m139660c(c6895a2.m35500c(), AbstractC23322a.zds_ic_posts_block_line_24, AbstractC2807a.icon_02)));
        if (!AbstractC19074t.m100204b(bottomSheetMenuBundleDataPrivacyQuickSetting.m45558c(), bool)) {
        }
        z12 = true;
        String m118743r0322 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_quick_setting_hide);
        AbstractC19074t.m100207e(m118743r0322, "getString(...)");
        arrayList.add(aVar22.m107577a(4, 13, 0, m118743r0322, "", z12, C27280g.m139660c(c6895a2.m35500c(), AbstractC23322a.zds_ic_posts_hide_line_24, AbstractC2807a.icon_02)));
        return arrayList;
    }

    @Override // jo.InterfaceC21320a
    /* renamed from: k */
    public List mo110398k(C3020p0 c3020p0, boolean z11) {
        ArrayList arrayList = new ArrayList();
        if (c3020p0 != null) {
            if (!c3020p0.f12027G && !c3020p0.m14518m0()) {
                if (c3020p0.m14494Y()) {
                    if (!z11 && c3020p0.f12058q != 21) {
                        C20639c.a aVar = C20639c.Companion;
                        PrivacyInfo privacyInfo = c3020p0.f12042V;
                        AbstractC19074t.m100207e(privacyInfo, "privacyInfo");
                        int m110401n = m110401n(privacyInfo);
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_edit_privacy_title);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar, 3, 3, m110401n, m118743r0, m110400m(c3020p0.f12042V), false, null, null, null, 480, null));
                    }
                    if (c3020p0.m14485P() && AbstractC23309i.m122305q2()) {
                        C20639c.a aVar2 = C20639c.Companion;
                        int i11 = AbstractC16803z.ic_bottom_sheet_menu_edit;
                        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_edit_post_feed_desc);
                        AbstractC19074t.m100207e(m118743r03, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar2, 3, 11, i11, m118743r02, m118743r03, false, null, null, null, 480, null));
                    }
                    C20639c.a aVar3 = C20639c.Companion;
                    int i12 = AbstractC16803z.ic_bottom_sheet_menu_delete;
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_title);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_delete_post_des);
                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar3, 3, 8, i12, m118743r04, m118743r05, false, null, null, null, 480, null));
                    if (c3020p0.m14482K() && !z11) {
                        int i13 = AbstractC16803z.ic_bottom_sheet_menu_tag;
                        String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_remove_tag_feed);
                        AbstractC19074t.m100207e(m118743r06, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar3, 3, 10, i13, m118743r06, null, false, null, null, null, 496, null));
                    }
                } else {
                    C20639c.a aVar4 = C20639c.Companion;
                    int i14 = AbstractC16803z.ic_bottom_sheet_menu_report;
                    String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bottom_sheet_menu_report_title);
                    AbstractC19074t.m100207e(m118743r07, "getString(...)");
                    arrayList.add(C20639c.a.m107568b(aVar4, 3, 9, i14, m118743r07, null, false, null, null, null, 496, null));
                    if (c3020p0.m14482K() && c3020p0.m14502d0() && !z11) {
                        int i15 = AbstractC16803z.ic_bottom_sheet_menu_tag;
                        String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.profile_remove_tag_feed);
                        AbstractC19074t.m100207e(m118743r08, "getString(...)");
                        arrayList.add(C20639c.a.m107568b(aVar4, 3, 10, i15, m118743r08, null, false, null, null, null, 496, null));
                    }
                }
            }
            if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
                arrayList.add(C20639c.a.m107568b(C20639c.Companion, 3, 43, 0, "Json detail", "", false, C27280g.m139658a(MainApplication.Companion.m35500c(), AbstractC16803z.icn_csc_menu_info_n), null, null, 416, null));
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public final String m110400m(PrivacyInfo privacyInfo) {
        if (privacyInfo != null) {
            String m45149t = privacyInfo.m45149t();
            AbstractC19074t.m100207e(m45149t, "getStringInFeed(...)");
            return m45149t;
        }
        return "";
    }

    /* renamed from: n */
    public final int m110401n(PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "privacy");
        int i11 = privacyInfo.f45973p;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return 0;
                    }
                    return AbstractC16803z.ic_bottom_sheet_menu_privacy_excepted_friend;
                }
                return AbstractC16803z.ic_bottom_sheet_menu_privacy_selected_friend;
            }
            return AbstractC16803z.ic_bottom_sheet_menu_privacy_only_me;
        }
        return AbstractC16803z.ic_bottom_sheet_menu_privacy_public;
    }

    /* renamed from: o */
    public final float m110402o() {
        return AbstractC23136l9.m118742r(16.0f) * C13778s1.m76962c();
    }

    /* renamed from: p */
    public final int m110403p(boolean z11) {
        int m118742r = AbstractC23136l9.m118742r(56.0f);
        int m118742r2 = AbstractC23136l9.m118742r(16.0f);
        int m118742r3 = AbstractC23136l9.m118742r(10.0f);
        int m118742r4 = AbstractC23136l9.m118742r(16.0f);
        if (z11) {
            return (((AbstractC23136l9.m118722k0() - m118742r) - m118742r2) - m118742r3) - m118742r4;
        }
        return (AbstractC23136l9.m118722k0() - m118742r) - m118742r2;
    }

    /* renamed from: q */
    public final int m110404q() {
        int m118742r = AbstractC23136l9.m118742r(56.0f);
        int m118742r2 = AbstractC23136l9.m118742r(16.0f);
        return ((AbstractC23136l9.m118722k0() - m118742r) - m118742r2) - AbstractC23136l9.m118742r(6.0f);
    }

    /* renamed from: r */
    public final boolean m110405r(ItemAlbumMobile itemAlbumMobile) {
        if (itemAlbumMobile == null) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(itemAlbumMobile.f42593q) || TextUtils.isEmpty(itemAlbumMobile.f42595r) || TextUtils.isEmpty(itemAlbumMobile.f42599t)) {
                return false;
            }
            if (!itemAlbumMobile.m40506Q()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: s */
    public final void m110406s(C3000l0 c3000l0, String str) {
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        AbstractC19074t.m100208f(str, "feedItemId");
        int i11 = c3000l0.f11893p;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("4400%d%d", Arrays.copyOf(new Object[]{1, Integer.valueOf(c3000l0.m14327d0(str) + 1)}, 2));
                    AbstractC19074t.m100207e(format, "format(...)");
                    AbstractC23647d.m123898h(format, "");
                    return;
                }
                return;
            }
            C19067n0 c19067n02 = C19067n0.f94947a;
            String format2 = String.format("4400%d%d", Arrays.copyOf(new Object[]{2, Integer.valueOf(c3000l0.m14327d0(str) + 1)}, 2));
            AbstractC19074t.m100207e(format2, "format(...)");
            AbstractC23647d.m123898h(format2, "");
            return;
        }
        AbstractC23647d.m123898h("4400", "");
    }
}
