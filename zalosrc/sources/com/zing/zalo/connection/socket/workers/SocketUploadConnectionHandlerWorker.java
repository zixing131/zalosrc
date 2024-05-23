package com.zing.zalo.connection.socket.workers;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import mm0.AbstractC23351f;
import on0.AbstractC24341v;
import p645xh.C29630g;

/* loaded from: classes3.dex */
public final class SocketUploadConnectionHandlerWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketUploadConnectionHandlerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(workerParameters, "params");
    }

    @Override // androidx.work.Worker
    public AbstractC2252t.a doWork() {
        boolean m127127w;
        boolean m127127w2;
        boolean m127127w3;
        try {
            C29630g.m147299E0().f136861E = System.currentTimeMillis();
            m127127w = AbstractC24341v.m127127w(getInputData().m11532j("action"), "com.zing.zalo.socketuploaddownload.WAKEUPDEVICE", false, 2, null);
            if (!m127127w) {
                m127127w2 = AbstractC24341v.m127127w(getInputData().m11532j("action"), "com.zing.zalo.socketuploaddownload.RECONNECT", false, 2, null);
                if (!m127127w2) {
                    m127127w3 = AbstractC24341v.m127127w(getInputData().m11532j("action"), "com.zing.zalo.socketuploaddownload.WAKEUPDEVICE_UPLOAD", false, 2, null);
                    if (m127127w3) {
                        C29630g.m147299E0().m147324a1();
                    }
                } else {
                    C29630g.m147299E0().m147313P0();
                }
            } else {
                AbstractC23351f.m122784a("Socket Upload ACTION_WAKEUPDEVICE AFTER PING", true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUploadConnection", e11.toString());
        }
        AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
        AbstractC19074t.m100207e(m11891c, "success(...)");
        return m11891c;
    }
}
