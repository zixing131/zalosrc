package if0;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dj.C17945a0;
import fn0.AbstractC19074t;
import if0.InterfaceC20544q;
import me0.AbstractC23136l9;
import p363nh.C23744a;

/* renamed from: if0.c */
/* loaded from: classes5.dex */
public final class C20530c implements InterfaceC20544q {

    /* renamed from: a */
    private final C17945a0 f100847a;

    /* renamed from: b */
    private a f100848b;

    /* renamed from: if0.c$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: e0 */
        void mo64430e0(String str);
    }

    /* renamed from: if0.c$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f100849a;

        static {
            int[] iArr = new int[InterfaceC20544q.a.values().length];
            try {
                iArr[InterfaceC20544q.a.f100885q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC20544q.a.f100886r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC20544q.a.f100887s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterfaceC20544q.a.f100888t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterfaceC20544q.a.f100889u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f100849a = iArr;
        }
    }

    public C20530c(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        this.f100847a = c17945a0;
    }

    /* renamed from: d */
    private final void m106673d(String str) {
        C20534g.f100864a.m106706u(this.f100847a, str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    @Override // if0.InterfaceC20544q
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo106674a(InterfaceC20544q.a aVar) {
        String m118743r0;
        a aVar2;
        AbstractC19074t.m100208f(aVar, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        int i11 = b.f100849a[aVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_to_speech_server_error);
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_can_not_react);
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_to_text_no_voice);
                        i12 = 4;
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_to_text_no_local_file);
                i12 = 2;
            }
            AbstractC19074t.m100205c(m118743r0);
            C20534g c20534g = C20534g.f100864a;
            String m94992R3 = this.f100847a.m94992R3();
            AbstractC19074t.m100207e(m94992R3, "getLogChatType(...)");
            c20534g.m106702q(m94992R3, i12);
            aVar2 = this.f100848b;
            if (aVar2 != null) {
                aVar2.mo64430e0(m118743r0);
            }
            m106673d(null);
        }
        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_to_text_unsupported_format);
        i12 = 0;
        AbstractC19074t.m100205c(m118743r0);
        C20534g c20534g2 = C20534g.f100864a;
        String m94992R32 = this.f100847a.m94992R3();
        AbstractC19074t.m100207e(m94992R32, "getLogChatType(...)");
        c20534g2.m106702q(m94992R32, i12);
        aVar2 = this.f100848b;
        if (aVar2 != null) {
        }
        m106673d(null);
    }

    @Override // if0.InterfaceC20544q
    /* renamed from: b */
    public void mo106675b() {
        this.f100847a.m95111d9();
        C23744a.Companion.m124119a().m124116d(6, this.f100847a.m95029V3());
    }

    /* renamed from: c */
    public final void m106676c(a aVar) {
        this.f100848b = aVar;
    }

    @Override // if0.InterfaceC20544q
    public void onSuccess(String str) {
        AbstractC19074t.m100208f(str, "text");
        if (str.length() == 0) {
            mo106674a(InterfaceC20544q.a.f100888t);
        } else {
            m106673d(str);
        }
    }
}
