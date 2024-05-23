package sh;

import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import p559uv.InterfaceC27372b;

/* renamed from: sh.a */
/* loaded from: classes3.dex */
public interface InterfaceC26248a {

    /* renamed from: sh.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC7761b m134974a(InterfaceC26248a interfaceC26248a, long j11, String str, VideoBlendingParam videoBlendingParam, InterfaceC7761b.c cVar, int i11, InterfaceC27372b interfaceC27372b, int i12, Object obj) {
            int i13;
            InterfaceC27372b interfaceC27372b2;
            if (obj == null) {
                if ((i12 & 16) != 0) {
                    i13 = -1;
                } else {
                    i13 = i11;
                }
                if ((i12 & 32) != 0) {
                    interfaceC27372b2 = null;
                } else {
                    interfaceC27372b2 = interfaceC27372b;
                }
                return interfaceC26248a.mo39564b(j11, str, videoBlendingParam, cVar, i13, interfaceC27372b2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addVideoTask");
        }
    }

    /* renamed from: a */
    void mo39563a(long j11);

    /* renamed from: b */
    InterfaceC7761b mo39564b(long j11, String str, VideoBlendingParam videoBlendingParam, InterfaceC7761b.c cVar, int i11, InterfaceC27372b interfaceC27372b);
}
