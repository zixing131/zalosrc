package p714zf;

import android.media.AudioRecord;
import java.nio.ByteBuffer;

/* renamed from: zf.n */
/* loaded from: classes3.dex */
public class C31823n implements InterfaceC31810a {

    /* renamed from: a */
    private final AudioRecord f146038a;

    /* renamed from: b */
    private int f146039b;

    public C31823n() {
        AudioRecord.getMinBufferSize(44100, 16, 2);
        this.f146039b = 49152;
        this.f146038a = new AudioRecord(5, 44100, 16, 2, this.f146039b);
    }

    @Override // p714zf.InterfaceC31810a
    /* renamed from: a */
    public int mo152839a(ByteBuffer byteBuffer, int i11) {
        return this.f146038a.read(byteBuffer, i11);
    }

    @Override // p714zf.InterfaceC31810a
    public void start() {
        this.f146038a.startRecording();
    }

    @Override // p714zf.InterfaceC31810a
    public void stop() {
        this.f146038a.stop();
    }
}
