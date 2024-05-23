package q30;

import android.net.Uri;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23280z4;
import on0.AbstractC24342w;
import p185gc.AbstractC19377a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: q30.a */
/* loaded from: classes5.dex */
public final class C25104a extends AbstractC19377a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q30.a$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120591t;

        /* renamed from: u */
        final /* synthetic */ String f120592u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Continuation continuation) {
            super(2, continuation);
            this.f120592u = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f120592u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            int m127178g0;
            AbstractC28298d.m142578e();
            if (this.f120591t == 0) {
                AbstractC24862s.m129228b(obj);
                String str = this.f120592u;
                if (str != null && str.length() != 0) {
                    String m120351s = AbstractC23280z4.m120351s(Uri.parse(str));
                    String str2 = File.separator;
                    AbstractC19074t.m100207e(str2, "separator");
                    m127178g0 = AbstractC24342w.m127178g0(m120351s, str2, 0, false, 6, null);
                    String substring = m120351s.substring(0, m127178g0);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    return substring;
                }
                return str;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(String str, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new a(str, null), continuation);
    }
}
