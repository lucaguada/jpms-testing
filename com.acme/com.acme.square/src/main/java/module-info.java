import com.acme.api.Shape;
import com.acme.square.Square;

module com.acme.square {
  requires transitive com.acme.api;

  provides Shape with Square;
}
