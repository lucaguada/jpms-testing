import com.acme.api.Shape;
import com.acme.rectangle.Rectangle;

module com.acme.rectangle {
  requires transitive com.acme.api;

  provides Shape with Rectangle;

  opens com.acme.rectangle to org.junit.jupiter.api;
}
