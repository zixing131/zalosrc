package me0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.appcompat.widget.C1167f;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.p077ui.chat.widget.photosuggest.NewMultiPhotoSuggestCollapsedView;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.p077ui.widget.reaction.ReactionDetailItemView;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerInContextMenuView;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.webview.C16786d;
import com.zing.zalo.zinstant.AbstractC17148f0;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import l30.AbstractC22055v0;
import le0.AbstractC22459a;
import p161fg.C18922m;
import p348mi.AbstractC23309i;
import p405ov.C24559a;
import p716zh.C31845ac;
import p716zh.C31994kb;
import qm0.AbstractC25368s;
import th.AbstractC26681b;
import th.AbstractC26682c;
import yt.EnumC31080j;

/* renamed from: me0.s8 */
/* loaded from: classes.dex */
public final class C23212s8 {

    /* renamed from: a */
    public static final C23212s8 f112471a = new C23212s8();

    /* renamed from: b */
    private static final String f112472b = C23212s8.class.getSimpleName();

    /* renamed from: c */
    private static int f112473c = -1;

    /* renamed from: d */
    private static final HashMap f112474d = new HashMap();

    /* renamed from: e */
    private static final HashMap f112475e = new HashMap();

    /* renamed from: f */
    private static final AtomicBoolean f112476f = new AtomicBoolean(false);

    /* renamed from: g */
    private static final AtomicBoolean f112477g = new AtomicBoolean(false);

    private C23212s8() {
    }

    /* renamed from: a */
    private static final void m119594a(List list, boolean z11, int i11, int i12) {
        int i13;
        int i14;
        if (z11 && Build.VERSION.SDK_INT < 23) {
            list.remove(MainApplication.Companion.m35500c());
        }
        if (list.isEmpty()) {
            return;
        }
        int m122165mb = AbstractC23309i.m122165mb();
        if (m122165mb != 0 && (m122165mb == 1 || (Build.VERSION.SDK_INT >= 29 && (MainApplication.Companion.m35500c().getResources().getConfiguration().uiMode & 48) != 16))) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        f112473c = i13;
        int size = list.size();
        int i15 = 0;
        while (true) {
            int i16 = 2;
            if (i15 < size) {
                Context context = (Context) list.get(i15);
                if (z11) {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{AbstractC16781w.themeId});
                    AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(...)");
                    try {
                        i14 = obtainStyledAttributes.getInteger(0, -1);
                    } finally {
                        obtainStyledAttributes.recycle();
                    }
                } else {
                    i14 = -1;
                }
                if (!z11 || i13 != i14) {
                    if (i13 != 0) {
                        if (i13 == 1) {
                            context.setTheme(i11);
                        }
                    } else {
                        context.setTheme(i12);
                    }
                    if (i14 != -1) {
                        f112476f.compareAndSet(false, true);
                        int i17 = Build.VERSION.SDK_INT;
                        if (i17 == 23) {
                            C1167f.m5528b().m5535g((Context) list.get(i15));
                        }
                        if (i17 == 34 && (context instanceof ZaloLauncherActivity)) {
                            f112477g.compareAndSet(false, true);
                            f112471a.m119605m(i13);
                            ((ZaloLauncherActivity) context).recreate();
                            return;
                        }
                    } else {
                        AbstractC20110a.f98889a.mo104548a("onFirstSetupThemeChanged %d->%d", Integer.valueOf(i14), Integer.valueOf(i13));
                        f112477g.compareAndSet(true, false);
                        f112471a.m119604l();
                    }
                }
                i15++;
            } else {
                AtomicBoolean atomicBoolean = f112476f;
                if (atomicBoolean.get()) {
                    atomicBoolean.compareAndSet(true, false);
                    f112477g.compareAndSet(true, false);
                    AbstractC20110a.f98889a.mo104548a("onThemeChanged to theme %d", Integer.valueOf(i13));
                    f112471a.m119605m(i13);
                }
                if (i13 != 1) {
                    i16 = 1;
                }
                AbstractC17148f0.m91697p(i16);
                C16786d.a aVar = C16786d.Companion;
                if (aVar.m89649f() && !aVar.m89648e()) {
                    C16786d m89644c = C16786d.a.m89644c(aVar, null, 1, null);
                    m89644c.m89641h0();
                    m89644c.m89642j0(EnumC31080j.f143272p);
                }
                C11891a.b bVar = C11891a.Companion;
                if (bVar.m66091m()) {
                    C11891a.b.m66078g(bVar, null, 1, null).m66073q0();
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: b */
    public static final void m119595b(Context context) {
        m119597d(context, false, 0, 0, 14, null);
    }

    /* renamed from: c */
    public static final void m119596c(Context context, boolean z11, int i11, int i12) {
        List m131506n;
        MainApplication.C6895a c6895a = MainApplication.Companion;
        m131506n = AbstractC25368s.m131506n(c6895a.m35500c());
        if (context != null) {
            if (!(true ^ AbstractC19074t.m100204b(context, c6895a.m35500c()))) {
                context = null;
            }
            if (context != null) {
                m131506n.add(context);
            }
        }
        Context m35502e = c6895a.m35502e();
        if (m35502e != null) {
            m131506n.add(m35502e);
        }
        m119594a(m131506n, z11, i11, i12);
    }

    /* renamed from: d */
    public static /* synthetic */ void m119597d(Context context, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            context = null;
        }
        if ((i13 & 2) != 0) {
            z11 = true;
        }
        if ((i13 & 4) != 0) {
            i11 = AbstractC8915g0.ThemeDefault_Dark;
        }
        if ((i13 & 8) != 0) {
            i12 = AbstractC8915g0.ThemeDefault_Light;
        }
        m119596c(context, z11, i11, i12);
    }

    /* renamed from: e */
    public static final void m119598e(Context context) {
        AbstractC19074t.m100208f(context, "context");
        m119600g(context, false, 0, 0, 14, null);
    }

    /* renamed from: f */
    public static final void m119599f(Context context, boolean z11, int i11, int i12) {
        ArrayList m131500h;
        AbstractC19074t.m100208f(context, "context");
        m131500h = AbstractC25368s.m131500h(context);
        m119594a(m131500h, z11, i11, i12);
    }

    /* renamed from: g */
    public static /* synthetic */ void m119600g(Context context, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z11 = true;
        }
        if ((i13 & 4) != 0) {
            i11 = AbstractC8915g0.ThemeDefault_Dark;
        }
        if ((i13 & 8) != 0) {
            i12 = AbstractC8915g0.ThemeDefault_Light;
        }
        m119599f(context, z11, i11, i12);
    }

    /* renamed from: h */
    public static final int m119601h() {
        int i11 = f112473c;
        if (i11 != -1) {
            if (i11 != 0) {
                return 1;
            }
            return 0;
        }
        int m122165mb = AbstractC23309i.m122165mb();
        if (m122165mb > 2 || m122165mb < 0) {
            return 0;
        }
        if (m122165mb == 2) {
            if ((MainApplication.Companion.m35500c().getResources().getConfiguration().uiMode & 48) != 16) {
                return 1;
            }
            return 0;
        }
        return m122165mb;
    }

    /* renamed from: i */
    public static final boolean m119602i() {
        if (m119601h() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m119603k() {
        if (m119601h() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m119604l() {
        f112474d.clear();
        f112475e.clear();
        C31994kb.m154233h().m154237d();
    }

    /* renamed from: m */
    private final void m119605m(int i11) {
        C24559a.m127933c("SettingTheme", "Start onThemeChanged target: " + i11);
        f112474d.clear();
        f112475e.clear();
        AbstractC11531v0.Companion.m62558b();
        AbstractC19646n0.m102940V1();
        AbstractC26682c.m137037a(i11);
        ChatInputBar.m65382m(i11);
        if (AbstractC26681b.f126356a) {
            C18922m.m99141t().m99155o(i11);
        }
        ReactionPickerView.m76807c(i11);
        ReactionPickerInContextMenuView.m76802c(i11);
        ReactionDetailItemView.m76790a(i11);
        C23278z2.m120142m1();
        AbstractC23170p.m119343a(i11);
        AbstractC22055v0.m115136Z();
        C31845ac.m152996J().m153060q(i11);
        C31994kb.m154233h().m154237d();
        NewMultiPhotoSuggestCollapsedView.m65442a(i11);
        C24559a.m127933c("SettingTheme", "End onThemeChanged target: " + i11);
    }

    /* renamed from: n */
    public static final int m119606n(int i11) {
        return m119607o(MainApplication.Companion.m35500c(), i11);
    }

    /* renamed from: o */
    public static final int m119607o(Context context, int i11) {
        Integer num;
        HashMap hashMap = f112474d;
        if (hashMap.containsKey(Integer.valueOf(i11)) && (num = (Integer) hashMap.get(Integer.valueOf(i11))) != null) {
            return num.intValue();
        }
        int m116119a = AbstractC22459a.m116119a(context, i11);
        hashMap.put(Integer.valueOf(i11), Integer.valueOf(m116119a));
        return m116119a;
    }

    /* renamed from: p */
    public static final Drawable m119608p(int i11) {
        return m119609q(MainApplication.Companion.m35500c(), i11);
    }

    /* renamed from: q */
    public static final Drawable m119609q(Context context, int i11) {
        return AbstractC22459a.m116120b(context, i11);
    }

    /* renamed from: r */
    public static final int m119610r(int i11) {
        return m119611s(MainApplication.Companion.m35500c(), i11);
    }

    /* renamed from: s */
    public static final int m119611s(Context context, int i11) {
        Integer num;
        HashMap hashMap = f112475e;
        if (hashMap.containsKey(Integer.valueOf(i11)) && (num = (Integer) hashMap.get(Integer.valueOf(i11))) != null) {
            return num.intValue();
        }
        int m116121c = AbstractC22459a.m116121c(context, i11);
        hashMap.put(Integer.valueOf(i11), Integer.valueOf(m116121c));
        return m116121c;
    }

    /* renamed from: j */
    public final AtomicBoolean m119612j() {
        return f112477g;
    }
}
