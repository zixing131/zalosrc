package qo0;

import android.content.Context;
import com.zing.zalo.dynamic.features.base.Feature;
import kotlinx.coroutines.flow.StateFlow;
import org.webrtc.EglBase;
import org.webrtc.videofilter.ZVideoFilter;
import org.webrtc.videofilter.ZVideoFilterAgent;
import p113dw.InterfaceC18073b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: qo0.b */
/* loaded from: classes7.dex */
public interface InterfaceC25444b extends ZVideoFilterAgent, InterfaceC18073b, Feature {

    /* renamed from: qo0.b$a */
    /* loaded from: classes7.dex */
    public interface a extends Feature.Provider {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: qo0.b$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f121841p = new b("Unavailable", 0);

        /* renamed from: q */
        public static final b f121842q = new b("NotReady", 1);

        /* renamed from: r */
        public static final b f121843r = new b("Ready", 2);

        /* renamed from: s */
        public static final b f121844s = new b("Error", 3);

        /* renamed from: t */
        private static final /* synthetic */ b[] f121845t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f121846u;

        static {
            b[] m131792b = m131792b();
            f121845t = m131792b;
            f121846u = AbstractC30166b.m148796a(m131792b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m131792b() {
            return new b[]{f121841p, f121842q, f121843r, f121844s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f121845t.clone();
        }
    }

    /* renamed from: b */
    boolean mo131785b();

    /* renamed from: c */
    StateFlow mo131786c();

    /* renamed from: d */
    void mo131787d(EglBase.Context context, Context context2, String str, C25447g c25447g);

    ZVideoFilter.StatusCode getStatus();

    void resetState();
}
