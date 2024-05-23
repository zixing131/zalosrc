package gt;

import android.graphics.Bitmap;
import android.opengl.ETC1;
import android.opengl.ETC1Util;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import cg.C3459g;
import gt.AbstractC19593a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.json.JSONArray;
import org.json.JSONObject;
import se0.AbstractC26236a;

/* renamed from: gt.g */
/* loaded from: classes4.dex */
public class C19599g extends AbstractC19593a {

    /* renamed from: c */
    public final String f97358c;

    /* renamed from: d */
    public FloatBuffer f97359d;

    /* renamed from: e */
    public FloatBuffer f97360e;

    /* renamed from: f */
    private ByteBuffer f97361f;

    /* renamed from: g */
    private ByteBuffer f97362g;

    /* renamed from: h */
    private int f97363h;

    /* renamed from: i */
    private int f97364i;

    /* renamed from: j */
    private Bitmap f97365j;

    /* renamed from: k */
    private int[] f97366k;

    public C19599g(JSONObject jSONObject, C3459g c3459g) {
        super(jSONObject);
        ETC1Util.ETC1Texture m17429d;
        this.f97340b = AbstractC19593a.a.TEXTURE;
        if (jSONObject.has("acv")) {
            byte[] m17431f = c3459g.m17431f(jSONObject.getString("acv"));
            this.f97363h = 256;
            this.f97364i = 1;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(256 * 4);
            this.f97361f = allocateDirect;
            allocateDirect.put(m17431f).position(0);
        } else if (jSONObject.has("image")) {
            this.f97365j = c3459g.m17428c(jSONObject.getString("image"));
        } else if (jSONObject.has("pkm") && (m17429d = c3459g.m17429d(jSONObject.getString("pkm"))) != null) {
            this.f97363h = m17429d.getWidth();
            this.f97364i = m17429d.getHeight();
            this.f97362g = m17429d.getData();
        }
        this.f97358c = jSONObject.getString("coordinate_name");
        if (jSONObject.has("coordinate_value")) {
            JSONArray jSONArray = jSONObject.getJSONArray("coordinate_value");
            if (jSONArray.length() >= 8) {
                this.f97359d = ByteBuffer.allocateDirect(256).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.f97360e = ByteBuffer.allocateDirect(256).order(ByteOrder.nativeOrder()).asFloatBuffer();
                for (int i11 = 0; i11 < 8; i11++) {
                    this.f97359d.put((float) jSONArray.getDouble(i11));
                }
            }
        }
    }

    /* renamed from: b */
    public int m102568b() {
        int[] iArr = this.f97366k;
        if (iArr == null) {
            return -1;
        }
        return iArr[0];
    }

    /* renamed from: c */
    public void m102569c() {
        int i11;
        int[] iArr = this.f97366k;
        if (iArr != null && (i11 = iArr[0]) > 0) {
            GLES20.glBindTexture(3553, i11);
            ByteBuffer byteBuffer = this.f97361f;
            if (byteBuffer != null) {
                byteBuffer.position(0);
                GLES20.glTexSubImage2D(3553, 0, 0, 0, this.f97363h, this.f97364i, 6408, 5121, this.f97361f);
                return;
            }
            Bitmap bitmap = this.f97365j;
            if (bitmap != null) {
                GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
                return;
            }
            if (this.f97362g != null) {
                if (ETC1Util.isETC1Supported()) {
                    GLES20.glCompressedTexSubImage2D(3553, 0, 0, 0, this.f97363h, this.f97364i, 36196, this.f97362g.remaining(), this.f97362g);
                    return;
                }
                int i12 = this.f97363h * 3;
                ByteBuffer order = ByteBuffer.allocateDirect(this.f97364i * i12).order(ByteOrder.nativeOrder());
                ETC1.decodeImage(this.f97362g, order, this.f97363h, this.f97364i, 3, i12);
                GLES20.glTexSubImage2D(3553, 0, 0, 0, this.f97363h, this.f97364i, 6407, 5121, order);
                return;
            }
            return;
        }
        int[] iArr2 = new int[1];
        this.f97366k = iArr2;
        ByteBuffer byteBuffer2 = this.f97361f;
        if (byteBuffer2 != null) {
            byteBuffer2.position(0);
            AbstractC26236a.m134903j(this.f97366k, 0, this.f97363h, this.f97364i, this.f97361f);
            return;
        }
        Bitmap bitmap2 = this.f97365j;
        if (bitmap2 != null) {
            AbstractC26236a.m134904k(iArr2, 0, bitmap2);
            return;
        }
        ByteBuffer byteBuffer3 = this.f97362g;
        if (byteBuffer3 != null) {
            AbstractC26236a.m134905l(iArr2, 0, this.f97363h, this.f97364i, byteBuffer3);
        }
    }

    /* renamed from: d */
    public void m102570d() {
        int[] iArr = this.f97366k;
        if (iArr != null && iArr[0] > 0) {
            AbstractC26236a.m134899f(iArr, 0);
            this.f97366k = null;
        }
    }
}
