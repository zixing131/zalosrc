package vg;

import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaHandlerThread;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import l30.C22013a0;
import me0.C23055e5;
import nh0.C23793c;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* renamed from: vg.f8 */
/* loaded from: classes3.dex */
public abstract class AbstractC28065f8 {

    /* renamed from: vg.f8$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        int f130964a;

        /* renamed from: b */
        String f130965b;

        /* renamed from: c */
        String f130966c;

        /* renamed from: d */
        int f130967d;

        /* renamed from: e */
        int f130968e;

        public a(int i11, String str, String str2, int i12, int i13) {
            this.f130964a = i11;
            this.f130965b = str;
            this.f130966c = str2;
            this.f130967d = i12;
            this.f130968e = i13;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m141532b(C31980jc c31980jc) {
        int i11;
        int i12 = 2;
        try {
            ZMediaPlayerSettings.VideoConfig videoConfig = ZMediaPlayerSettings.getVideoConfig(2);
            if (videoConfig.isZaloPlayer() && m141533c(videoConfig)) {
                ArrayList arrayList = new ArrayList();
                if (c31980jc != null) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = c31980jc.f147031x;
                    if (arrayList3 != null) {
                        arrayList2.addAll(arrayList3);
                    }
                    ArrayList arrayList4 = c31980jc.f147032y;
                    if (arrayList4 != null) {
                        arrayList2.addAll(arrayList4);
                    }
                    c31980jc.f147022G.clear();
                    long mo124311f = C23793c.m124316k().mo124311f() / 1000;
                    int m114926e = C22013a0.m114926e();
                    Iterator it = arrayList2.iterator();
                    boolean z11 = false;
                    int i13 = 0;
                    while (it.hasNext()) {
                        C32123ta c32123ta = (C32123ta) it.next();
                        if (c32123ta != null && c32123ta.f148140i == i12 && c32123ta.f148126b != i12 && (mo124311f - c32123ta.f148150p) - 300 <= m114926e) {
                            String m155067D = c32123ta.m155067D();
                            if (!TextUtils.isEmpty(m155067D) && !c31980jc.f147022G.containsKey(m155067D)) {
                                boolean z12 = !c32123ta.f148152r;
                                if (z12 && !z11) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (z12) {
                                    z11 = true;
                                }
                                a aVar = new a(2, c31980jc.mo17216b(), m155067D, i13, i11);
                                arrayList.add(aVar);
                                c31980jc.f147022G.put(m155067D, aVar);
                                i13++;
                            }
                        }
                        i12 = 2;
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    a aVar2 = (a) it2.next();
                    if (aVar2 != null) {
                        ZMediaPlayer.precache(ZMediaPlayerSettings.getVideoConfig(2), aVar2.f130966c, aVar2.f130965b, aVar2.f130967d, aVar2.f130964a, aVar2.f130968e);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: c */
    public static boolean m141533c(ZMediaPlayerSettings.VideoConfig videoConfig) {
        if (videoConfig != null && videoConfig.getEnablePrecache() != 0 && C23055e5.m118271f()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m141534d(C31980jc c31980jc) {
        ZMediaHandlerThread.getInstance().execute(new Runnable() { // from class: vg.e8
            public /* synthetic */ RunnableC28055e8() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28065f8.m141532b(C31980jc.this);
            }
        });
    }
}
