package u00;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import bp0.AbstractC3096i0;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.startup.StartupApplication;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fg0.ThreadFactoryC18928a;
import gm0.AbstractC19509c;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kn.AbstractC21777d;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23224t9;
import me0.C23269y3;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p371nv.C23952g;
import p379o3.C23999j;
import p471r3.EnumC25629a;
import p716zh.C31973j5;
import vg.AbstractC28033c6;
import vg.AbstractC28113k6;

/* renamed from: u00.u */
/* loaded from: classes4.dex */
public class C26939u {

    /* renamed from: k */
    private static final String f127369k = "u";

    /* renamed from: a */
    private final ShortcutManager f127370a;

    /* renamed from: b */
    private final ExecutorService f127371b;

    /* renamed from: c */
    private Comparator f127372c;

    /* renamed from: d */
    private volatile boolean f127373d;

    /* renamed from: e */
    private volatile boolean f127374e;

    /* renamed from: f */
    private volatile long f127375f;

    /* renamed from: g */
    private ArrayMap f127376g;

    /* renamed from: h */
    private String f127377h;

    /* renamed from: i */
    private String[] f127378i;

    /* renamed from: j */
    private final Runnable f127379j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u00.u$a */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:            if (r8 > 0) goto L120;     */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            List dynamicShortcuts;
            int maxShortcutCountPerActivity;
            String id2;
            String id3;
            try {
                C26939u.m138776x("checkDiffDataShortcutRunnable");
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
            if (AbstractC23309i.m122490v2() && !AbstractC21777d.m112318i() && !C26939u.this.m138773u()) {
                dynamicShortcuts = C26939u.this.f127370a.getDynamicShortcuts();
                ArrayList arrayList = new ArrayList(dynamicShortcuts);
                boolean z11 = true;
                if (!arrayList.isEmpty()) {
                    C26939u.this.m138769p();
                    Collections.sort(arrayList, C26939u.this.f127372c);
                    maxShortcutCountPerActivity = C26939u.this.f127370a.getMaxShortcutCountPerActivity();
                    int min = Math.min(maxShortcutCountPerActivity, 10);
                    int size = arrayList.size();
                    boolean z12 = true;
                    int i11 = 0;
                    int i12 = -1;
                    for (int i13 = 0; i13 < size; i13++) {
                        ShortcutInfo m138746a = AbstractC26927i.m138746a(arrayList.get(i13));
                        if (m138746a != null) {
                            id3 = m138746a.getId();
                            if (!AbstractC21777d.m112320k(id3)) {
                                if (z12) {
                                    z12 = false;
                                }
                                if (i12 == -1) {
                                    i12 = i13;
                                }
                                i11++;
                            }
                        }
                    }
                    int i14 = min - size;
                    if (z12) {
                        if (i14 <= 0) {
                            if (i14 == 0 && AbstractC21777d.m112319j()) {
                                i14 = min;
                            } else {
                                i14 = 0;
                            }
                        }
                    } else {
                        i14 += i11;
                    }
                    int min2 = Math.min(i14, min);
                    if (min2 > 0) {
                        List m112313d = AbstractC21777d.m112313d(min2, true);
                        if (!m112313d.isEmpty()) {
                            int size2 = m112313d.size();
                            if (size2 == i11) {
                                for (int i15 = 0; i15 < size2; i15++) {
                                    id2 = AbstractC26927i.m138746a(arrayList.get(i12 + i15)).getId();
                                    if (!id2.equals(AbstractC23352g.m122788d(((ContactProfile) m112313d.get(i15)).f42434r))) {
                                        break;
                                    }
                                }
                            }
                        }
                        e11.printStackTrace();
                        return;
                    }
                    z11 = false;
                }
                C26939u.m138776x("needRefresh=" + z11);
                if (z11) {
                    C26939u.m138770q().m138785z();
                }
            }
        }
    }

    /* renamed from: u00.u$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        static final C26939u f127381a = new C26939u();
    }

    /* synthetic */ C26939u(AbstractC26940v abstractC26940v) {
        this();
    }

    /* renamed from: A */
    private void m138756A(Context context) {
        if (m138765j()) {
            return;
        }
        this.f127371b.execute(new Runnable() { // from class: u00.r

            /* renamed from: q */
            public final /* synthetic */ Context f127368q;

            public /* synthetic */ RunnableC26936r(Context context2) {
                r2 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C26939u.this.m138775w(r2);
            }
        });
    }

    /* renamed from: C */
    public static void m138757C() {
        if (!m138767n()) {
            return;
        }
        m138770q().m138758D();
    }

    /* renamed from: D */
    private void m138758D() {
        try {
            if (!m138773u() && this.f127375f == 0) {
                this.f127375f = System.currentTimeMillis();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j */
    private static boolean m138765j() {
        try {
            return !StartupApplication.Companion.m56558a().m56555o();
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0041 A[Catch: Exception -> 0x0021, TRY_LEAVE, TryCatch #0 {Exception -> 0x0021, blocks: (B:15:0x0003, B:17:0x000a, B:19:0x0010, B:21:0x0016, B:5:0x0041, B:22:0x0023, B:24:0x002b, B:26:0x0035), top: B:14:0x0003 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Bitmap m138766k(ContactProfile contactProfile, C23528a c23528a) {
        C3979l m123605k;
        if (contactProfile != null) {
            try {
                if (contactProfile.m40374K0()) {
                    C31973j5 m40388T = contactProfile.m40388T(false);
                    if (m40388T != null && m40388T.m153786t0()) {
                        m123605k = c23528a.m123605k(m40388T.m153756e(), 0, EnumC25629a.DEFAULT);
                        if (m123605k == null) {
                            return null;
                        }
                        return C23999j.m125743s2(m123605k.m18839c());
                    }
                } else if (!TextUtils.isEmpty(contactProfile.f42446v) && !C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                    m123605k = c23528a.m123605k(contactProfile.f42446v, 0, EnumC25629a.DEFAULT);
                    if (m123605k == null) {
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
            e11.printStackTrace();
            return null;
        }
        m123605k = null;
        if (m123605k == null) {
        }
    }

    /* renamed from: n */
    public static boolean m138767n() {
        if (Build.VERSION.SDK_INT >= 25 && AbstractC23309i.m122490v2() && AbstractC21777d.m112319j()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private void m138768o() {
        if (this.f127376g == null) {
            this.f127376g = new ArrayMap();
        }
        if (this.f127378i == null) {
            this.f127378i = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
        }
    }

    /* renamed from: p */
    public void m138769p() {
        if (this.f127372c == null) {
            this.f127372c = new Comparator() { // from class: u00.s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m138774v;
                    m138774v = C26939u.m138774v((ShortcutInfo) obj, (ShortcutInfo) obj2);
                    return m138774v;
                }
            };
        }
    }

    /* renamed from: q */
    public static C26939u m138770q() {
        return b.f127381a;
    }

    /* renamed from: r */
    private List m138771r(Context context, boolean z11) {
        Context m118649F;
        if (!AbstractC23309i.m122490v2() && Build.VERSION.SDK_INT >= 29) {
            return new ArrayList();
        }
        m138768o();
        try {
            String m120039g = C23269y3.m120039g(this.f127378i);
            if (TextUtils.isEmpty(m120039g)) {
                m120039g = AbstractC18458a.f93019a;
            }
            String str = this.f127377h;
            if (str == null || !TextUtils.equals(str, m120039g)) {
                this.f127377h = m120039g;
                if (TextUtils.equals(m120039g, AbstractC18458a.f93019a)) {
                    m118649F = context;
                } else {
                    m118649F = AbstractC23136l9.m118649F(new Locale(this.f127377h));
                }
                m138772t(m118649F);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return AbstractC21777d.m112312c(context, this.f127376g, z11);
    }

    /* renamed from: t */
    private void m138772t(Context context) {
        if (AbstractC21777d.m112322m()) {
            this.f127376g.put("SHORTCUT_ID_BACKUP_RESTORE", context.getString(AbstractC8020f0.str_title_shortcut_sync_msg));
        }
        this.f127376g.put("SHORTCUT_ID_GLOBAL_SEARCH", context.getString(AbstractC8020f0.hint_default_search));
        this.f127376g.put("SHORTCUT_ID_SCAN_QRCODE", context.getString(AbstractC8020f0.qrcode_scan_qrcode));
        this.f127376g.put("SHORTCUT_ID_SWITCH_ACCOUNT", context.getString(AbstractC8020f0.str_header_switch_account));
        this.f127376g.put("SHORTCUT_ID_POST_FEED", context.getString(AbstractC8020f0.str_shortcut_post_feed));
    }

    /* renamed from: u */
    public boolean m138773u() {
        if ((!CoreUtility.f89239o || AbstractC3096i0.m15505O()) && this.f127374e && !this.f127373d && CoreUtility.m93148a() != null && !CoreUtility.m93148a().mo100080h() && !ZaloBubbleActivity.Companion.m57054h()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static /* synthetic */ int m138774v(ShortcutInfo shortcutInfo, ShortcutInfo shortcutInfo2) {
        int rank;
        int rank2;
        if (Build.VERSION.SDK_INT >= 25) {
            rank = shortcutInfo.getRank();
            rank2 = shortcutInfo2.getRank();
            return rank - rank2;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ec A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0015, B:11:0x004a, B:13:0x0050, B:16:0x0057, B:18:0x005f, B:20:0x0067, B:23:0x006f, B:27:0x0084, B:31:0x008f, B:32:0x009b, B:34:0x00a5, B:35:0x00ae, B:37:0x00b4, B:39:0x00bc, B:42:0x0140, B:43:0x0145, B:45:0x014b, B:46:0x015f, B:48:0x0165, B:50:0x016c, B:51:0x0180, B:54:0x0189, B:56:0x01ac, B:58:0x01b1, B:59:0x01b8, B:63:0x0171, B:64:0x0178, B:65:0x0150, B:67:0x0156, B:68:0x015b, B:69:0x0159, B:74:0x01e6, B:76:0x01ec, B:77:0x01f7, B:79:0x01fd, B:80:0x0227, B:82:0x01c7, B:84:0x01cd, B:87:0x0077, B:88:0x007d, B:90:0x01d6, B:91:0x01de), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fd A[Catch: Exception -> 0x0012, TryCatch #0 {Exception -> 0x0012, blocks: (B:3:0x0006, B:5:0x000e, B:8:0x0015, B:11:0x004a, B:13:0x0050, B:16:0x0057, B:18:0x005f, B:20:0x0067, B:23:0x006f, B:27:0x0084, B:31:0x008f, B:32:0x009b, B:34:0x00a5, B:35:0x00ae, B:37:0x00b4, B:39:0x00bc, B:42:0x0140, B:43:0x0145, B:45:0x014b, B:46:0x015f, B:48:0x0165, B:50:0x016c, B:51:0x0180, B:54:0x0189, B:56:0x01ac, B:58:0x01b1, B:59:0x01b8, B:63:0x0171, B:64:0x0178, B:65:0x0150, B:67:0x0156, B:68:0x015b, B:69:0x0159, B:74:0x01e6, B:76:0x01ec, B:77:0x01f7, B:79:0x01fd, B:80:0x0227, B:82:0x01c7, B:84:0x01cd, B:87:0x0077, B:88:0x007d, B:90:0x01d6, B:91:0x01de), top: B:2:0x0006 }] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m138775w(Context context) {
        int maxShortcutCountPerActivity;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean dynamicShortcuts;
        int size;
        HashSet hashSet;
        Iterator it;
        int i11;
        Icon createWithResource;
        String m40383Q;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder extras;
        ShortcutInfo.Builder intent;
        ShortcutInfo build;
        try {
            this.f127375f = 0L;
            if (!AbstractC21777d.m112317h()) {
                m138777B();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            maxShortcutCountPerActivity = this.f127370a.getMaxShortcutCountPerActivity();
            C23952g.m125345j(f127369k, "maxDynamicShortcutCanAdd=" + maxShortcutCountPerActivity);
            int min = Math.min(maxShortcutCountPerActivity, 10);
            ArrayList arrayList = new ArrayList();
            int i12 = Build.VERSION.SDK_INT;
            boolean z14 = true;
            if (i12 >= 30) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AbstractC23165o5.m119333b() && AbstractC23304d.f113266D0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                if (AbstractC21777d.m112318i()) {
                    List m138771r = m138771r(context, z11);
                    if (i12 >= 29) {
                        if (z12 || min >= m138771r.size() + 2) {
                            arrayList.addAll(m138771r);
                        }
                        if (!z12) {
                            size = min - arrayList.size();
                            if (size > 0) {
                                C23528a c23528a = null;
                                if (i12 >= 29) {
                                    hashSet = new HashSet();
                                    hashSet.add("com.zing.zalo.sharingShortcuts.category.SHARE_TARGET");
                                } else {
                                    hashSet = null;
                                }
                                List m112313d = AbstractC21777d.m112313d(size, true);
                                if (m112313d.size() > 0) {
                                    GroupAvatarView groupAvatarView = new GroupAvatarView(context);
                                    Iterator it2 = m112313d.iterator();
                                    while (it2.hasNext()) {
                                        ContactProfile contactProfile = (ContactProfile) it2.next();
                                        if (contactProfile != null) {
                                            PersistableBundle persistableBundle = new PersistableBundle();
                                            persistableBundle.putString("userId", contactProfile.f42434r);
                                            persistableBundle.putString("displayname", contactProfile.f42437s);
                                            persistableBundle.putString("avatar", contactProfile.f42446v);
                                            persistableBundle.putBoolean("fromDirectShare", z14);
                                            AbstractC23224t9.m119691f(persistableBundle);
                                            Intent intent2 = new Intent();
                                            it = it2;
                                            intent2.setComponent(new ComponentName(CoreUtility.getAppContext(), "com.zing.zalo.ui.IntentHandlerActivityAlias"));
                                            intent2.setAction("com.zing.zalo.action.SHORTCUT_MINI_CHAT");
                                            intent2.putExtra("intent_sig", AbstractC23224t9.m119686a(intent2));
                                            intent2.addFlags(268435456);
                                            intent2.addFlags(67108864);
                                            intent2.putExtra(ZinstantMetaConstant.TARGET_VIEWPORT, AbstractC19509c.m101979b(AESUtils.m39916b(CoreUtility.f89225a, contactProfile.f42434r.getBytes())));
                                            intent2.putExtra("owner", AbstractC23352g.m122788d(String.valueOf(CoreUtility.f89233i)));
                                            intent2.putExtra("from_dynamic_shortcut", true);
                                            groupAvatarView.m75731c(contactProfile);
                                            Bitmap bitmap = groupAvatarView.getBitmap();
                                            if (bitmap == null) {
                                                if (c23528a == null) {
                                                    c23528a = new C23528a(context);
                                                }
                                                bitmap = m138766k(contactProfile, c23528a);
                                            }
                                            if (bitmap != null) {
                                                createWithResource = Icon.createWithBitmap(bitmap);
                                            } else {
                                                if (contactProfile.m40374K0()) {
                                                    i11 = AbstractC16803z.avatar_groupchat;
                                                } else {
                                                    i11 = AbstractC16803z.icn_avatar_default;
                                                }
                                                createWithResource = Icon.createWithResource(context, i11);
                                            }
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
                                            if (TextUtils.isEmpty(m40383Q)) {
                                                m40383Q = " ";
                                            }
                                            AbstractC28113k6.m141600a();
                                            shortLabel = AbstractC28033c6.m141471a(context, AbstractC23352g.m122788d(contactProfile.f42434r)).setShortLabel(m40383Q);
                                            longLabel = shortLabel.setLongLabel(m40383Q);
                                            icon = longLabel.setIcon(createWithResource);
                                            extras = icon.setExtras(persistableBundle);
                                            intent = extras.setIntent(intent2);
                                            if (hashSet != null) {
                                                intent.setCategories(hashSet);
                                            }
                                            if (z11) {
                                                intent.setRank(arrayList.size());
                                            }
                                            build = intent.build();
                                            arrayList.add(build);
                                        } else {
                                            it = it2;
                                        }
                                        it2 = it;
                                        z14 = true;
                                    }
                                } else if (arrayList.isEmpty()) {
                                    arrayList.addAll(m138771r(context, z11));
                                }
                                z13 = true;
                            }
                        }
                    } else {
                        arrayList.addAll(m138771r);
                    }
                } else {
                    if (z12) {
                        arrayList.addAll(m138771r(context, z11));
                    }
                    size = min - arrayList.size();
                    if (size > 0) {
                    }
                }
                if (arrayList.size() > min) {
                    arrayList = new ArrayList(arrayList.subList(0, min));
                }
                if (!arrayList.isEmpty()) {
                    dynamicShortcuts = this.f127370a.setDynamicShortcuts(arrayList);
                    this.f127373d = !dynamicShortcuts;
                    m138776x("Update shortcut success, shortcut size=" + arrayList.size() + ", max shortcut=" + min);
                }
                this.f127374e = z13;
                m138776x("refreshDynamicShortcutApp: Total=" + (System.currentTimeMillis() - currentTimeMillis));
            }
            arrayList.addAll(m138771r(context, z11));
            z13 = false;
            if (arrayList.size() > min) {
            }
            if (!arrayList.isEmpty()) {
            }
            this.f127374e = z13;
            m138776x("refreshDynamicShortcutApp: Total=" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f127369k, e11);
        }
    }

    /* renamed from: x */
    public static void m138776x(String str) {
    }

    /* renamed from: B */
    public void m138777B() {
        try {
            this.f127370a.removeAllDynamicShortcuts();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m138778g() {
        try {
            if (m138767n() && !m138773u() && this.f127375f != 0 && System.currentTimeMillis() - this.f127375f >= 43200000) {
                m138776x("doCheckDiffDataShortcut, mLastTimeMarkDirtyDataRecentChat=" + this.f127375f);
                this.f127375f = 0L;
                this.f127371b.execute(this.f127379j);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m138779h(String str) {
        List pinnedShortcuts;
        String id2;
        Intent intent;
        Intent intent2;
        String id3;
        if (!TextUtils.isEmpty(str) && this.f127370a != null) {
            ArrayList arrayList = new ArrayList();
            pinnedShortcuts = this.f127370a.getPinnedShortcuts();
            Iterator it = pinnedShortcuts.iterator();
            while (it.hasNext()) {
                ShortcutInfo m138746a = AbstractC26927i.m138746a(it.next());
                id2 = m138746a.getId();
                if (id2.equals(AbstractC23352g.m122788d(str))) {
                    intent = m138746a.getIntent();
                    if (intent != null) {
                        String m122788d = AbstractC23352g.m122788d(CoreUtility.f89233i);
                        intent2 = m138746a.getIntent();
                        if (m122788d.equals(intent2.getStringExtra("owner"))) {
                            id3 = m138746a.getId();
                            arrayList.add(id3);
                        }
                    }
                }
            }
            this.f127370a.disableShortcuts(arrayList);
        }
    }

    /* renamed from: i */
    public void m138780i() {
        try {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("SHORTCUT_ID_BACKUP_RESTORE");
            arrayList.add("SHORTCUT_ID_GLOBAL_SEARCH");
            arrayList.add("SHORTCUT_ID_SCAN_QRCODE");
            arrayList.add("SHORTCUT_ID_SWITCH_ACCOUNT");
            arrayList.add("SHORTCUT_ID_POST_FEED");
            String m118675S = AbstractC23136l9.m118675S(new Locale(C23269y3.m120039g(this.f127378i)), AbstractC8020f0.str_shortcut_type_feature_off);
            if (!TextUtils.isEmpty(m118675S)) {
                this.f127370a.disableShortcuts(arrayList, m118675S);
            } else {
                this.f127370a.disableShortcuts(arrayList);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public void m138781l() {
        List pinnedShortcuts;
        Intent intent;
        Intent intent2;
        String id2;
        if (this.f127370a != null) {
            ArrayList arrayList = new ArrayList();
            pinnedShortcuts = this.f127370a.getPinnedShortcuts();
            Iterator it = pinnedShortcuts.iterator();
            while (it.hasNext()) {
                ShortcutInfo m138746a = AbstractC26927i.m138746a(it.next());
                intent = m138746a.getIntent();
                if (intent != null) {
                    String m122788d = AbstractC23352g.m122788d(CoreUtility.f89233i);
                    intent2 = m138746a.getIntent();
                    if (m122788d.equals(intent2.getStringExtra("owner"))) {
                        id2 = m138746a.getId();
                        arrayList.add(id2);
                    }
                }
            }
            this.f127370a.enableShortcuts(arrayList);
        }
    }

    /* renamed from: m */
    public void m138782m(String str) {
        List pinnedShortcuts;
        String id2;
        Intent intent;
        Intent intent2;
        String id3;
        if (!TextUtils.isEmpty(str) && this.f127370a != null) {
            ArrayList arrayList = new ArrayList();
            pinnedShortcuts = this.f127370a.getPinnedShortcuts();
            Iterator it = pinnedShortcuts.iterator();
            while (it.hasNext()) {
                ShortcutInfo m138746a = AbstractC26927i.m138746a(it.next());
                id2 = m138746a.getId();
                if (id2.equals(AbstractC23352g.m122788d(str))) {
                    intent = m138746a.getIntent();
                    if (intent != null) {
                        String m122788d = AbstractC23352g.m122788d(CoreUtility.f89233i);
                        intent2 = m138746a.getIntent();
                        if (m122788d.equals(intent2.getStringExtra("owner"))) {
                            id3 = m138746a.getId();
                            arrayList.add(id3);
                        }
                    }
                }
            }
            this.f127370a.enableShortcuts(arrayList);
        }
    }

    /* renamed from: s */
    public ShortcutManager m138783s() {
        return this.f127370a;
    }

    /* renamed from: y */
    public void m138784y(ShortcutInfo shortcutInfo) {
        this.f127370a.pushDynamicShortcut(shortcutInfo);
    }

    /* renamed from: z */
    public void m138785z() {
        m138756A(MainApplication.getAppContext());
    }

    private C26939u() {
        Object systemService;
        this.f127373d = false;
        this.f127374e = true;
        this.f127375f = 0L;
        this.f127379j = new a();
        systemService = MainApplication.getAppContext().getSystemService((Class<Object>) AbstractC26934p.m138753a());
        this.f127370a = AbstractC26935q.m138754a(systemService);
        this.f127371b = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("SharingShortcuts"));
    }
}
