package ly;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.zqrcode.QRCodeManager;
import com.zing.zalo.zqrcode.Result;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;

/* renamed from: ly.a */
/* loaded from: classes4.dex */
public final class HandlerC22666a extends Handler {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private WeakReference f111113a;

    /* renamed from: ly.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ly.a$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo66895a(int i11);

        /* renamed from: b */
        void mo66896b(Result.Success success, int i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22666a(Looper looper) {
        super(looper);
        AbstractC19074t.m100208f(looper, "myLopper");
    }

    /* renamed from: a */
    public final void m117294a(b bVar) {
        this.f111113a = new WeakReference(bVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        boolean z11;
        AbstractC19074t.m100208f(message, "msg");
        b bVar = null;
        boolean z12 = true;
        QRCodeManager instance$default = QRCodeManager.Companion.getInstance$default(QRCodeManager.Companion, null, 1, null);
        if (instance$default != null) {
            if (message.what == 1) {
                try {
                    Bitmap bitmap = (Bitmap) message.obj;
                    if (message.arg1 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (message.arg2 != 1) {
                        z12 = false;
                    }
                    int i11 = -1;
                    if (message.getData() != null) {
                        i11 = message.getData().getInt("QR_DECODE_SENDING_UID", -1);
                    }
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Result decode = instance$default.decode(bitmap, z11, z12);
                        WeakReference weakReference = this.f111113a;
                        if (weakReference != null) {
                            bVar = (b) weakReference.get();
                        }
                        if ((decode instanceof Result.Success) && ((Result.Success) decode).m92585e().length() > 0) {
                            if (bVar != null) {
                                bVar.mo66896b((Result.Success) decode, i11);
                                return;
                            }
                            return;
                        } else {
                            if (bVar != null) {
                                bVar.mo66895a(i11);
                                return;
                            }
                            return;
                        }
                    }
                    WeakReference weakReference2 = this.f111113a;
                    if (weakReference2 != null) {
                        bVar = (b) weakReference2.get();
                    }
                    if (bVar != null) {
                        bVar.mo66895a(i11);
                    }
                    if (z12 && bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            super.handleMessage(message);
        }
    }
}
