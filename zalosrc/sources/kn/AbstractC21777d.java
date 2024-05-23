package kn;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import gm0.AbstractC19509c;
import gw.C19669z;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23165o5;
import me0.AbstractC23179p8;
import me0.AbstractC23224t9;
import mm0.AbstractC23352g;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p716zh.C31973j5;
import vg.AbstractC28033c6;
import vg.AbstractC28113k6;

/* renamed from: kn.d */
/* loaded from: classes3.dex */
public abstract class AbstractC21777d {
    /* renamed from: a */
    public static boolean m112310a(C17487o0 c17487o0, Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.getBoolean("from_dynamic_shortcut", false)) {
                    Bundle bundle2 = new Bundle();
                    if (c17487o0.m93029Q(MainTabView.class)) {
                        bundle2.putInt("SHOW_WITH_FLAGS", 16777216);
                        c17487o0.m93069k2(MainTabView.class, bundle2, 0, true);
                    } else {
                        bundle2.putInt("SHOW_WITH_FLAGS", 67108864);
                        c17487o0.m93069k2(MainTabView.class, bundle2, 2, true);
                    }
                    return true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    private static Intent m112311b(String str, boolean z11) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(CoreUtility.getAppContext(), "com.zing.zalo.ui.IntentHandlerActivityAlias"));
        intent.setAction(str);
        if (z11) {
            intent.putExtra("intent_sig", AbstractC23224t9.m119686a(intent));
        }
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        return intent;
    }

    /* renamed from: c */
    public static List m112312c(Context context, ArrayMap arrayMap, boolean z11) {
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        int i11;
        Icon createWithResource;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder intent;
        ShortcutInfo build;
        ShortcutInfo.Builder shortLabel2;
        ShortcutInfo.Builder longLabel2;
        int i12;
        Icon createWithResource2;
        ShortcutInfo.Builder icon2;
        ShortcutInfo.Builder intent2;
        ShortcutInfo build2;
        boolean z12;
        ShortcutInfo.Builder shortLabel3;
        ShortcutInfo.Builder longLabel3;
        int i13;
        Icon createWithResource3;
        ShortcutInfo.Builder icon3;
        ShortcutInfo.Builder intent3;
        ShortcutInfo build3;
        ContactProfile contactProfile;
        ShortcutInfo.Builder shortLabel4;
        ShortcutInfo.Builder longLabel4;
        ShortcutInfo.Builder icon4;
        ShortcutInfo.Builder shortLabel5;
        ShortcutInfo.Builder longLabel5;
        int i14;
        Icon createWithResource4;
        ShortcutInfo.Builder icon5;
        ShortcutInfo.Builder intent4;
        ShortcutInfo build4;
        ArrayList arrayList = new ArrayList();
        try {
            int m112314e = m112314e();
            if (m112322m()) {
                Intent m112311b = m112311b("com.zing.zalo.action.SHORTCUT_OPEN_BACKUP_RESTORE", false);
                String str = (String) arrayMap.get("SHORTCUT_ID_BACKUP_RESTORE");
                if (str == null) {
                    str = context.getString(AbstractC8020f0.str_title_shortcut_sync_msg);
                }
                AbstractC28113k6.m141600a();
                shortLabel5 = AbstractC28033c6.m141471a(context, "SHORTCUT_ID_BACKUP_RESTORE").setShortLabel(str);
                longLabel5 = shortLabel5.setLongLabel(str);
                if (m112314e == 0) {
                    i14 = AbstractC16803z.ic_shortcut_raster_backup;
                } else {
                    i14 = AbstractC16803z.ic_shortcut_raster_dark_backup;
                }
                createWithResource4 = Icon.createWithResource(context, i14);
                icon5 = longLabel5.setIcon(createWithResource4);
                intent4 = icon5.setIntent(m112311b);
                if (z11) {
                    intent4.setRank(arrayList.size());
                }
                build4 = intent4.build();
                arrayList.add(build4);
            }
            Intent m112311b2 = m112311b("com.zing.zalo.action.SHORTCUT_GLOBAL_SEARCH", false);
            String str2 = (String) arrayMap.get("SHORTCUT_ID_GLOBAL_SEARCH");
            if (str2 == null) {
                str2 = context.getString(AbstractC8020f0.hint_default_search);
            }
            AbstractC28113k6.m141600a();
            shortLabel = AbstractC28033c6.m141471a(context, "SHORTCUT_ID_GLOBAL_SEARCH").setShortLabel(str2);
            longLabel = shortLabel.setLongLabel(str2);
            if (m112314e == 0) {
                i11 = AbstractC16803z.ic_shortcut_raster_search;
            } else {
                i11 = AbstractC16803z.ic_shortcut_raster_dark_search;
            }
            createWithResource = Icon.createWithResource(context, i11);
            icon = longLabel.setIcon(createWithResource);
            intent = icon.setIntent(m112311b2);
            if (z11) {
                intent.setRank(arrayList.size());
            }
            build = intent.build();
            arrayList.add(build);
            Intent m112311b3 = m112311b("com.zing.zalo.action.SHORTCUT_SCAN_QRCODE", false);
            String str3 = (String) arrayMap.get("SHORTCUT_ID_SCAN_QRCODE");
            if (str3 == null) {
                str3 = context.getString(AbstractC8020f0.qrcode_scan_qrcode);
            }
            AbstractC28113k6.m141600a();
            shortLabel2 = AbstractC28033c6.m141471a(context, "SHORTCUT_ID_SCAN_QRCODE").setShortLabel(str3);
            longLabel2 = shortLabel2.setLongLabel(str3);
            if (m112314e == 0) {
                i12 = AbstractC16803z.ic_shortcut_raster_qr;
            } else {
                i12 = AbstractC16803z.ic_shortcut_raster_dark_qr;
            }
            createWithResource2 = Icon.createWithResource(context, i12);
            icon2 = longLabel2.setIcon(createWithResource2);
            intent2 = icon2.setIntent(m112311b3);
            if (z11) {
                intent2.setRank(arrayList.size());
            }
            build2 = intent2.build();
            arrayList.add(build2);
            List m119419e = AbstractC23179p8.m119419e();
            if (AbstractC23165o5.m119333b() && AbstractC23304d.f113266D0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (AbstractC23309i.m121529Vf() && !z12 && m119419e.size() >= 2 && (contactProfile = (ContactProfile) m119419e.get(1)) != null && !contactProfile.f42434r.equals(CoreUtility.f89233i)) {
                GroupAvatarView groupAvatarView = new GroupAvatarView(context);
                groupAvatarView.m75731c(contactProfile);
                Bitmap bitmap = groupAvatarView.getBitmap();
                Icon createWithBitmap = bitmap != null ? Icon.createWithBitmap(bitmap) : Icon.createWithResource(context, AbstractC16803z.icn_avatar_default);
                Intent m112311b4 = m112311b("com.zing.zalo.action.SHORTCUT_SWITCH_ACCOUNT", true);
                m112311b4.putExtra(ZinstantMetaConstant.TARGET_VIEWPORT, AbstractC19509c.m101979b(AESUtils.m39916b(CoreUtility.f89225a, contactProfile.f42434r.getBytes())));
                m112311b4.putExtra("owner", AbstractC23352g.m122788d(String.valueOf(CoreUtility.f89233i)));
                String str4 = (String) arrayMap.get("SHORTCUT_ID_SWITCH_ACCOUNT");
                if (str4 == null) {
                    str4 = context.getString(AbstractC8020f0.str_header_switch_account);
                }
                AbstractC28113k6.m141600a();
                shortLabel4 = AbstractC28033c6.m141471a(context, "SHORTCUT_ID_SWITCH_ACCOUNT").setShortLabel(str4);
                longLabel4 = shortLabel4.setLongLabel(str4);
                icon4 = longLabel4.setIcon(createWithBitmap);
                intent3 = icon4.setIntent(m112311b4);
            } else {
                Intent m112311b5 = m112311b("com.zing.zalo.action.SHORTCUT_POST_FEED", false);
                String str5 = (String) arrayMap.get("SHORTCUT_ID_POST_FEED");
                if (str5 == null) {
                    str5 = context.getString(AbstractC8020f0.str_shortcut_post_feed);
                }
                AbstractC28113k6.m141600a();
                shortLabel3 = AbstractC28033c6.m141471a(context, "SHORTCUT_ID_POST_FEED").setShortLabel(str5);
                longLabel3 = shortLabel3.setLongLabel(str5);
                if (m112314e == 0) {
                    i13 = AbstractC16803z.ic_shortcut_raster_post;
                } else {
                    i13 = AbstractC16803z.ic_shortcut_raster_dark_post;
                }
                createWithResource3 = Icon.createWithResource(context, i13);
                icon3 = longLabel3.setIcon(createWithResource3);
                intent3 = icon3.setIntent(m112311b5);
            }
            if (z11) {
                intent3.setRank(arrayList.size());
            }
            build3 = intent3.build();
            arrayList.add(build3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List m112313d(int i11, boolean z11) {
        List<ContactProfile> m103199P;
        int i12;
        if (i11 <= 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(i11);
        if (!z11) {
            if (i11 < 5) {
                i12 = 20;
            } else {
                i12 = i11 * 4;
            }
            m103199P = C7959d.m41638d1().m41832v1(1, i12);
        } else {
            m103199P = C19669z.m103146Y().m103199P();
        }
        if (m103199P != null && !m103199P.isEmpty()) {
            boolean isEmpty = true ^ TextUtils.isEmpty(AbstractC23309i.m122303q0());
            for (ContactProfile contactProfile : m103199P) {
                if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && m112321l(contactProfile.f42434r, isEmpty) && m112315f(contactProfile)) {
                    arrayList.add(contactProfile);
                    if (arrayList.size() >= i11) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static int m112314e() {
        try {
            if ((MainApplication.getAppContext().getResources().getConfiguration().uiMode & 48) != 32) {
                return 0;
            }
            return 1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static boolean m112315f(ContactProfile contactProfile) {
        String m40383Q;
        if (contactProfile.m40374K0()) {
            C31973j5 m40388T = contactProfile.m40388T(false);
            if (m40388T != null) {
                m40383Q = m40388T.m153793y();
            } else {
                m40383Q = contactProfile.f42437s.trim();
            }
        } else {
            m40383Q = contactProfile.m40383Q(true, false);
        }
        return !TextUtils.isEmpty(m40383Q);
    }

    /* renamed from: g */
    public static boolean m112316g(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: h */
    public static boolean m112317h() {
        if (!AbstractC23309i.m122490v2() && Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m112318i() {
        if (AbstractC23309i.m120787Bd() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m112319j() {
        if (AbstractC23309i.m120787Bd() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m112320k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1015083027:
                if (str.equals("SHORTCUT_ID_SWITCH_ACCOUNT")) {
                    c11 = 0;
                    break;
                }
                break;
            case 611600146:
                if (str.equals("SHORTCUT_ID_POST_FEED")) {
                    c11 = 1;
                    break;
                }
                break;
            case 825403612:
                if (str.equals("SHORTCUT_ID_BACKUP_RESTORE")) {
                    c11 = 2;
                    break;
                }
                break;
            case 1077824633:
                if (str.equals("SHORTCUT_ID_GLOBAL_SEARCH")) {
                    c11 = 3;
                    break;
                }
                break;
            case 1528857477:
                if (str.equals("SHORTCUT_ID_SCAN_QRCODE")) {
                    c11 = 4;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                if (!str.equals("SHORTCUT_ID_BACKUP_RESTORE")) {
                    return true;
                }
                return m112322m();
            default:
                return false;
        }
    }

    /* renamed from: l */
    public static boolean m112321l(String str, boolean z11) {
        if ((z11 && C21927m.m114302u().m114345m(str)) || AbstractC21935u.m114538e(str) == 1 || AbstractC21935u.m114515E(str)) {
            return false;
        }
        return !AbstractC21935u.m114551r(str);
    }

    /* renamed from: m */
    public static boolean m112322m() {
        return !AbstractC3489d.m17513u();
    }
}
