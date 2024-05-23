package bz;

import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import cp0.C17553b;
import df0.C17911a;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import p373nx.C23956b;

/* renamed from: bz.c */
/* loaded from: classes4.dex */
public class C3158c extends AbstractC3156a implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {

    /* renamed from: j */
    static final String f13342j = "c";

    /* renamed from: k */
    static final int f13343k = C17911a.f90436a.m94493c();

    /* renamed from: d */
    final Handler f13346d;

    /* renamed from: f */
    final HandlerThread f13348f;

    /* renamed from: g */
    ParcelFileDescriptor f13349g;

    /* renamed from: h */
    volatile b f13350h;

    /* renamed from: i */
    C17553b f13351i;

    /* renamed from: b */
    MediaRecorder f13344b = null;

    /* renamed from: c */
    volatile int f13345c = 1;

    /* renamed from: e */
    private boolean f13347e = false;

    /* renamed from: bz.c$a */
    /* loaded from: classes4.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C3158c c3158c;
            int i11 = message.what;
            boolean z11 = false;
            switch (i11) {
                case 1001:
                    try {
                        if (C3158c.this.f13345c == 1) {
                            C3158c.this.f13347e = false;
                            C3158c.this.f13346d.removeMessages(1001);
                            C3158c.this.f13345c = 2;
                            C3158c.this.f13344b = new C23956b(new SensitiveData("micro_csc_voice_record", "comm_csc"));
                            C3158c.this.f13344b.setAudioSource(1);
                            if (C3158c.this.m15884b()) {
                                C3158c.this.f13344b.setOutputFormat(6);
                                C3158c.this.f13344b.setAudioEncoder(3);
                                C3158c.this.f13344b.setAudioChannels(AbstractC23309i.m121661Z());
                                C3158c.this.f13344b.setAudioEncodingBitRate(AbstractC23309i.m121217N());
                                C3158c.this.f13344b.setAudioSamplingRate(AbstractC23309i.m122051jb());
                            } else {
                                C3158c.this.f13344b.setOutputFormat(3);
                                C3158c.this.f13344b.setAudioEncoder(1);
                                C3158c.this.f13344b.setAudioSamplingRate(8000);
                                C3158c.this.f13344b.setAudioEncodingBitRate(12200);
                                C3158c.this.f13344b.setAudioChannels(1);
                            }
                            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                            C3158c c3158c2 = C3158c.this;
                            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                            c3158c2.f13349g = parcelFileDescriptor2;
                            c3158c2.f13344b.setOutputFile(parcelFileDescriptor2.getFileDescriptor());
                            C3158c.this.f13344b.prepare();
                            if (C3158c.this.f13350h != null && C3158c.this.f13350h.isAlive() && !C3158c.this.f13350h.isInterrupted()) {
                                C3158c.this.f13350h.interrupt();
                            }
                            C3158c.this.f13345c = 3;
                            C3158c.this.f13350h = new b(parcelFileDescriptor);
                            C3158c.this.f13350h.start();
                            C3158c.this.f13344b.start();
                            C3158c.this.m15889g();
                            C3158c.this.f13346d.sendEmptyMessage(1010);
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        Message message2 = new Message();
                        message2.what = 1006;
                        message2.arg1 = -1;
                        message2.obj = e11;
                        C3158c.this.f13346d.sendMessage(message2);
                        return;
                    }
                case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                default:
                    return;
                case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                case 1008:
                    if (i11 == 1008) {
                        z11 = true;
                    }
                    try {
                        if (C3158c.this.f13345c != 3) {
                            if (C3158c.this.f13345c != 2) {
                                return;
                            }
                            if (!z11) {
                                C3158c.this.f13346d.sendEmptyMessageDelayed(ZAbstractBase.ZVU_BLEND_GEN_THUMB, 100L);
                                C3158c.this.f13346d.sendEmptyMessageDelayed(1008, 500L);
                                return;
                            }
                        }
                        C3158c.this.f13345c = 4;
                        C3158c.this.f13346d.removeMessages(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                        C3158c.this.f13346d.removeMessages(1008);
                        C3158c c3158c3 = C3158c.this;
                        if (c3158c3.f13344b != null) {
                            c3158c3.m15903r();
                            C3158c.this.f13344b.stop();
                            C3158c.this.f13344b.release();
                            C3158c c3158c4 = C3158c.this;
                            c3158c4.f13344b = null;
                            ParcelFileDescriptor parcelFileDescriptor3 = c3158c4.f13349g;
                            try {
                                if (parcelFileDescriptor3 != null) {
                                    try {
                                        parcelFileDescriptor3.close();
                                        c3158c = C3158c.this;
                                    } catch (Exception e12) {
                                        C3158c.this.m15902q(-1, e12);
                                        c3158c = C3158c.this;
                                    }
                                    c3158c.f13349g = null;
                                }
                            } finally {
                                C3158c.this.f13349g = null;
                            }
                        }
                        if (z11 || C3158c.this.f13347e) {
                            C3158c.this.f13346d.sendEmptyMessage(1005);
                            return;
                        }
                        return;
                    } catch (Exception e13) {
                        Message message3 = new Message();
                        message3.what = 1006;
                        message3.arg1 = -2;
                        message3.obj = e13;
                        C3158c.this.f13346d.sendMessage(message3);
                        return;
                    }
                case 1004:
                    try {
                        if (C3158c.this.f13345c != 3 && C3158c.this.f13345c != 4) {
                            return;
                        }
                        C3158c c3158c5 = C3158c.this;
                        byte[] bArr = (byte[]) message.obj;
                        if (message.arg1 != 0) {
                            z11 = true;
                        }
                        c3158c5.m15885c(bArr, z11);
                        return;
                    } catch (Exception e14) {
                        AbstractC23350e.m122776f(C3158c.f13342j, e14);
                        return;
                    }
                case 1005:
                    try {
                        C3158c.this.f13347e = true;
                        if (C3158c.this.f13345c != 4) {
                            if (C3158c.this.f13345c != 2 && C3158c.this.f13345c != 3) {
                                return;
                            }
                            C3158c.this.f13346d.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                            return;
                        }
                        C3158c.this.f13345c = 1;
                        ParcelFileDescriptor parcelFileDescriptor4 = C3158c.this.f13349g;
                        if (parcelFileDescriptor4 != null) {
                            parcelFileDescriptor4.close();
                        }
                        C3158c.this.m15887e();
                        if (C3158c.this.f13350h != null && C3158c.this.f13350h.isAlive() && !C3158c.this.f13350h.isInterrupted()) {
                            C3158c.this.f13350h.interrupt();
                            return;
                        }
                        return;
                    } catch (Exception e15) {
                        AbstractC23350e.m122776f(C3158c.f13342j, e15);
                        return;
                    }
                case 1006:
                    Object obj = message.obj;
                    if (!(obj instanceof Exception)) {
                        C3158c.this.m15902q(message.arg1, null);
                        return;
                    }
                    C3158c.this.m15902q(message.arg1, (Exception) obj);
                    return;
                case 1007:
                    try {
                        C3158c.this.f13348f.getLooper().quit();
                        return;
                    } catch (Exception e16) {
                        C3158c.this.m15902q(-1, e16);
                        return;
                    }
                case 1009:
                    try {
                        if (C3158c.this.f13345c != 3 && C3158c.this.f13345c != 2) {
                            return;
                        }
                        C3158c.this.m15893k(message.arg1);
                        return;
                    } catch (Exception e17) {
                        AbstractC23350e.m122776f(C3158c.f13342j, e17);
                        return;
                    }
                case 1010:
                    try {
                        if (C3158c.this.f13345c != 3 && C3158c.this.f13345c != 2) {
                            return;
                        }
                        C3158c c3158c6 = C3158c.this;
                        if (c3158c6.f13344b == null) {
                            return;
                        }
                        c3158c6.m15903r();
                        C3158c.this.f13346d.sendEmptyMessageDelayed(1010, 100L);
                        return;
                    } catch (Exception e18) {
                        AbstractC23350e.m122776f(C3158c.f13342j, e18);
                        return;
                    }
            }
        }
    }

    /* renamed from: bz.c$b */
    /* loaded from: classes4.dex */
    class b extends Thread {

        /* renamed from: p */
        ParcelFileDescriptor f13353p;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            super("Z:PipeRecorder");
            this.f13353p = parcelFileDescriptor;
        }

        /* JADX WARN: Removed duplicated region for block: B:73:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0143 A[Catch: Exception -> 0x0147, TRY_LEAVE, TryCatch #11 {Exception -> 0x0147, blocks: (B:79:0x013f, B:81:0x0143), top: B:78:0x013f }] */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x00db -> B:35:0x014e). Please report as a decompilation issue!!! */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            FileOutputStream fileOutputStream;
            BufferedInputStream bufferedInputStream;
            Exception e11;
            Throwable th2;
            ParcelFileDescriptor parcelFileDescriptor;
            int i11;
            if (this.f13353p != null && C3158c.this.f13345c == 3) {
                try {
                    try {
                        fileOutputStream = new FileOutputStream(C3158c.this.m15883a());
                        try {
                            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f13353p);
                            int i12 = C3158c.f13343k;
                            bufferedInputStream = new BufferedInputStream(autoCloseInputStream, i12);
                            i11 = i12 * 2;
                        } catch (Exception e12) {
                            bufferedInputStream = null;
                            e11 = e12;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedInputStream = null;
                            th2 = th;
                            if (bufferedInputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            try {
                                parcelFileDescriptor = this.f13353p;
                                if (parcelFileDescriptor == null) {
                                }
                            } catch (Exception e13) {
                                AbstractC23350e.m122776f(C3158c.f13342j, e13);
                                throw th2;
                            }
                        }
                    } catch (Exception e14) {
                        bufferedInputStream = null;
                        e11 = e14;
                        fileOutputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                        bufferedInputStream = null;
                    }
                } catch (Exception e15) {
                    AbstractC23350e.m122776f(C3158c.f13342j, e15);
                }
                try {
                    try {
                        byte[] bArr = new byte[i11];
                        byte[] bArr2 = new byte[i11];
                        int i13 = 0;
                        int i14 = -1;
                        while (true) {
                            int i15 = C3158c.f13343k;
                            int read = bufferedInputStream.read(bArr2, i13, i15);
                            if (read == -1) {
                                break;
                            }
                            if (i14 > 0) {
                                String str = C3158c.f13342j;
                                String.format("socket write:%d", Integer.valueOf(i14));
                                fileOutputStream.write(bArr, 0, i14);
                                byte[] bArr3 = new byte[i14];
                                System.arraycopy(bArr, 0, bArr3, 0, i14);
                                C3158c.this.m15904s(bArr3, false);
                                i14 = 0;
                            }
                            i13 += read;
                            if (i13 >= i15) {
                                System.arraycopy(bArr2, 0, bArr, 0, i13);
                                i14 = i13;
                                i13 = 0;
                            }
                        }
                        if (i14 > 0) {
                            String str2 = C3158c.f13342j;
                            String.format("socket write:%d", Integer.valueOf(i14));
                            fileOutputStream.write(bArr, 0, i14);
                            byte[] bArr4 = new byte[i14];
                            System.arraycopy(bArr, 0, bArr4, 0, i14);
                            C3158c.this.m15904s(bArr4, true);
                        }
                        if (i13 > 0) {
                            String str3 = C3158c.f13342j;
                            String.format("socket write:%d", Integer.valueOf(i13));
                            fileOutputStream.write(bArr2, 0, i13);
                            byte[] bArr5 = new byte[i13];
                            System.arraycopy(bArr2, 0, bArr5, 0, i13);
                            C3158c.this.m15904s(bArr5, true);
                        }
                        String str4 = C3158c.f13342j;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("record done:");
                        sb2.append(C3158c.this.m15883a());
                        C3158c.this.f13346d.sendEmptyMessage(1005);
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e16) {
                            AbstractC23350e.m122776f(C3158c.f13342j, e16);
                        }
                        try {
                            fileOutputStream.close();
                        } catch (Exception e17) {
                            AbstractC23350e.m122776f(C3158c.f13342j, e17);
                        }
                        ParcelFileDescriptor parcelFileDescriptor2 = this.f13353p;
                        if (parcelFileDescriptor2 != null) {
                            parcelFileDescriptor2.close();
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (Exception e18) {
                                AbstractC23350e.m122776f(C3158c.f13342j, e18);
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e19) {
                                AbstractC23350e.m122776f(C3158c.f13342j, e19);
                            }
                        }
                        parcelFileDescriptor = this.f13353p;
                        if (parcelFileDescriptor == null) {
                            parcelFileDescriptor.close();
                            throw th2;
                        }
                        throw th2;
                    }
                } catch (Exception e21) {
                    e11 = e21;
                    Message message = new Message();
                    message.what = 1006;
                    message.arg1 = -1;
                    message.obj = e11;
                    C3158c.this.f13346d.sendMessage(message);
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e22) {
                            AbstractC23350e.m122776f(C3158c.f13342j, e22);
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e23) {
                            AbstractC23350e.m122776f(C3158c.f13342j, e23);
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptor3 = this.f13353p;
                    if (parcelFileDescriptor3 != null) {
                        parcelFileDescriptor3.close();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C3158c() {
        HandlerThread handlerThread = new HandlerThread("Z:PipeRecorder");
        this.f13348f = handlerThread;
        handlerThread.start();
        if (this.f13351i == null) {
            this.f13351i = C17553b.m93488c(MainApplication.getAppContext());
        }
        this.f13346d = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m15901p() {
        this.f13345c = 5;
        try {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f13349g;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                MediaRecorder mediaRecorder = this.f13344b;
                if (mediaRecorder != null) {
                    try {
                        mediaRecorder.stop();
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(f13342j, e11);
                    }
                    MediaRecorder mediaRecorder2 = this.f13344b;
                    if (mediaRecorder2 != null) {
                        mediaRecorder2.release();
                    }
                }
                if (this.f13348f.getLooper() != null) {
                    try {
                        this.f13346d.sendEmptyMessage(1007);
                    } catch (Exception e12) {
                        AbstractC23350e.m122776f(f13342j, e12);
                    }
                }
            } catch (Throwable th2) {
                this.f13344b = null;
                throw th2;
            }
        } catch (Exception e13) {
            AbstractC23350e.m122776f(f13342j, e13);
        }
        this.f13344b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m15902q(int i11, Exception exc) {
        m15888f(i11, exc);
    }

    @Override // bz.AbstractC3156a
    /* renamed from: d */
    public void mo15886d() {
        this.f13346d.post(new Runnable() { // from class: bz.b
            @Override // java.lang.Runnable
            public final void run() {
                C3158c.this.m15901p();
            }
        });
    }

    @Override // bz.AbstractC3156a
    /* renamed from: i */
    public void mo15891i() {
        this.f13346d.sendEmptyMessage(1001);
    }

    @Override // bz.AbstractC3156a
    /* renamed from: j */
    public void mo15892j() {
        if (this.f13345c == 5) {
            return;
        }
        this.f13346d.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public void onError(MediaRecorder mediaRecorder, int i11, int i12) {
        if (this.f13344b != mediaRecorder) {
            return;
        }
        Message message = new Message();
        message.what = 1006;
        message.arg1 = i11;
        message.arg2 = i12;
        message.obj = new Exception(String.format("onError:%d", Integer.valueOf(i11)));
        this.f13346d.sendMessage(message);
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public void onInfo(MediaRecorder mediaRecorder, int i11, int i12) {
        if (this.f13344b != mediaRecorder) {
            return;
        }
        Message message = new Message();
        message.what = 1006;
        message.arg1 = i11;
        message.arg2 = i12;
        message.obj = new Exception(String.format("onInfo:%d", Integer.valueOf(i11)));
        this.f13346d.sendMessage(message);
        this.f13346d.sendEmptyMessage(1009);
    }

    /* renamed from: r */
    void m15903r() {
        MediaRecorder mediaRecorder;
        try {
            if ((this.f13345c == 3 || this.f13345c == 2) && (mediaRecorder = this.f13344b) != null) {
                int maxAmplitude = mediaRecorder.getMaxAmplitude();
                Message message = new Message();
                message.what = 1009;
                message.arg1 = maxAmplitude;
                this.f13346d.sendMessage(message);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f13342j, e11);
        }
    }

    /* renamed from: s */
    void m15904s(byte[] bArr, boolean z11) {
        Message message = new Message();
        message.what = 1004;
        message.obj = bArr;
        message.arg1 = z11 ? 1 : 0;
        this.f13346d.sendMessage(message);
    }
}
